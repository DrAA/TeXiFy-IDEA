package nl.rubensten.texifyidea.gutter;

import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo;
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerProvider;
import com.intellij.codeInsight.navigation.NavigationGutterIconBuilder;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiManager;
import nl.rubensten.texifyidea.TexifyIcons;
import nl.rubensten.texifyidea.lang.LatexNoMathCommand;
import nl.rubensten.texifyidea.lang.RequiredFileArgument;
import nl.rubensten.texifyidea.psi.LatexCommands;
import nl.rubensten.texifyidea.psi.LatexRequiredParam;
import nl.rubensten.texifyidea.util.TexifyUtil;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static nl.rubensten.texifyidea.util.TexifyUtil.findFile;

/**
 * @author Ruben Schellekens
 */
public class LatexNavigationGutter extends RelatedItemLineMarkerProvider {

    @Override
    protected void collectNavigationMarkers(@NotNull PsiElement element,
                                            Collection<? super RelatedItemLineMarkerInfo> result) {
        // Only make markers when dealing with commands.
        if (!(element instanceof LatexCommands)) {
            return;
        }

        LatexCommands commands = (LatexCommands)element;
        PsiElement commandToken = commands.getCommandToken();
        if (commandToken == null) {
            return;
        }

        String fullCommand = commands.getCommandToken().getText();
        if (fullCommand == null) {
            return;
        }

        // Fetch the corresponding LatexNoMathCommand object.
        String commandName = fullCommand.substring(1);
        Optional<LatexNoMathCommand> commandHuh = LatexNoMathCommand.get(commandName);
        if (!commandHuh.isPresent()) {
            return;
        }

        LatexNoMathCommand command = commandHuh.get();
        List<RequiredFileArgument> arguments = command.getArgumentsOf(RequiredFileArgument.class);

        if (arguments.isEmpty()) {
            return;
        }

        // Get the required file arguments.
        RequiredFileArgument argument = arguments.get(0);
        List<LatexRequiredParam> requiredParams = TexifyUtil.getRequiredParameters(commands);
        if (requiredParams.isEmpty()) {
            return;
        }

        // Make filename. Substring is to remove { and }.
        String fileName = requiredParams.get(0).getGroup().getText();
        fileName = fileName.substring(1, fileName.length() - 1);

        // Look up target file.
        VirtualFile directory = element.getContainingFile().getContainingDirectory().getVirtualFile();
        Optional<VirtualFile> fileHuh = findFile(directory, fileName, argument.getSupportedExtensions());
        if (!fileHuh.isPresent()) {
            return;
        }

        // Build gutter icon.
        VirtualFile file = fileHuh.get();
        NavigationGutterIconBuilder<PsiElement> builder = NavigationGutterIconBuilder
                .create(TexifyIcons.getIconFromExtension(file.getExtension()))
                .setTarget(PsiManager.getInstance(element.getProject()).findFile(file))
                .setTooltipText("Go to referenced file '" + file.getName() + "'");

        result.add(builder.createLineMarkerInfo(element));
    }
}
