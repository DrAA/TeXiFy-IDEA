package nl.rubensten.texifyidea.util;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.PsiElement;
import nl.rubensten.texifyidea.file.BibliographyFileType;
import nl.rubensten.texifyidea.file.ClassFileType;
import nl.rubensten.texifyidea.file.LatexFileType;
import nl.rubensten.texifyidea.file.StyleFileType;
import nl.rubensten.texifyidea.latex.psi.LatexCommands;
import nl.rubensten.texifyidea.latex.psi.LatexParameter;
import nl.rubensten.texifyidea.latex.psi.LatexRequiredParam;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * @author Ruben Schellekens, Sten Wessel
 */
public class TexifyUtil {

    private TexifyUtil() {
    }

    /**
     * Get the FileType instance that corresponds to the given file extension.
     *
     * @param extensionWithoutDot
     *         The file extension to get the corresponding FileType instance of without a dot in
     *         front.
     * @return The corresponding FileType instance.
     * @throws IllegalArgumentException
     *         When {@code extensionWithoutDot} is {@code null}.
     */
    public static FileType getFileTypeByExtension(@NotNull String extensionWithoutDot)
            throws IllegalArgumentException {
        if (extensionWithoutDot == null) {
            throw new IllegalArgumentException("extensionWithoutDot cannot be null");
        }

        switch (extensionWithoutDot.toLowerCase()) {
            case "cls":
                return ClassFileType.INSTANCE;
            case "sty":
                return StyleFileType.INSTANCE;
            case "bib":
                return BibliographyFileType.INSTANCE;
            default:
                return LatexFileType.INSTANCE;
        }
    }

    /**
     * Appends an extension to a path only if the given path does not end in that extension.
     *
     * @param path
     *         The path to append the extension to.
     * @param extensionWithoutDot
     *         The extension to append optionally.
     * @return A path ending with the given extension without duplications (e.g. {@code .tex.tex} is
     * impossible}.
     * @throws IllegalArgumentException
     *         When {@code path} or {@code extensionWithoutDot} is {@code null}.
     */
    public static String appendExtension(@NotNull String path, @NotNull String extensionWithoutDot)
            throws IllegalArgumentException {
        if (path == null) {
            throw new IllegalArgumentException("path cannot be null");
        }

        if (extensionWithoutDot == null) {
            throw new IllegalArgumentException("extensionWithoutDot cannot be null");
        }

        if (path.toLowerCase().endsWith("." + extensionWithoutDot.toLowerCase())) {
            return path;
        }

        if (path.endsWith(".")) {
            return path + extensionWithoutDot;
        }

        return path + "." + extensionWithoutDot;
    }

    /**
     * Looks up all the required parameters from a given {@link LatexCommands}.
     *
     * @param command
     *         The command to get the required parameters of.
     * @return A list of all required parameters.
     */
    public static List<LatexRequiredParam> getRequiredParameters(LatexCommands command) {
        return command.getParameterList().stream()
                .filter(p -> p.getRequiredParam() != null)
                .map(LatexParameter::getRequiredParam)
                .collect(Collectors.toList());
    }

    /**
     * Checks if the given latex command marks a valid entry point for latex compilation.
     * <p>
     * A valid entry point means that a latex compilation can start from the file containing the
     * given command.
     *
     * @param command
     *         The command to check if the file marks a valid entry point.
     * @return {@code true} if the command marks a valid entry point, {@code false} if not.
     */
    public static boolean isEntryPoint(LatexCommands command) {
        // Currently: only allowing '\begin{document}'
        if (!command.getCommandToken().getText().equals("\\begin")) {
            return false;
        }

        List<LatexRequiredParam> requiredParams = getRequiredParameters(command);
        if (requiredParams.size() != 1) {
            return false;
        }

        return requiredParams.get(0).getText().equals("{document}");
    }

    /**
     * Checks if the given elements contain a valid entry point for latex compilation.
     * <p>
     * A valid entry point means that a latex compilation can start from the file containing the
     * given command.
     *
     * @param elements
     *         The elements to check for a valid entry point.
     * @return {@code true} if a valid entry point is found, {@code false} otherwise.
     */
    public static boolean containsEntryPoint(PsiElement[] elements) {
        for (PsiElement element : elements) {
            if (element instanceof LatexCommands) {
                LatexCommands commands = (LatexCommands)element;
                if (TexifyUtil.isEntryPoint(commands)) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Sends a formatted info message to the IntelliJ logger.
     * <p>
     * All messages start with the prefix "{@code TEXIFY-IDEA - }".
     *
     * @param format
     *         How the log should be formatted, see also {@link String#format(Locale, String,
     *         Object...)}.
     * @param objects
     *         The objects to bind to the format.
     */
    public static void logf(String format, Object... objects) {
        Logger logger = Logger.getInstance(Log.class);
        logger.info("TEXIFY-IDEA - " + String.format(format, objects));
    }

    /**
     * Little class to make the log messages look awesome :3
     *
     * @author Ruben Schellekens
     */
    private class Log {

    }

}
