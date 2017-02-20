package nl.rubensten.texifyidea.completion;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.patterns.PlatformPatterns;
import nl.rubensten.texifyidea.LatexLanguage;
import nl.rubensten.texifyidea.lang.LatexMode;
import nl.rubensten.texifyidea.latex.psi.LatexMathEnvironment;
import nl.rubensten.texifyidea.latex.psi.LatexTypes;

/**
 * @author Sten Wessel
 */
public class LatexCompletionContributor extends CompletionContributor {
    public LatexCompletionContributor() {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(LatexTypes.COMMAND_TOKEN).inside(LatexMathEnvironment.class).withLanguage(LatexLanguage.INSTANCE),
            new LatexCommandProvider(LatexMode.MATH)
        );

        extend(
                CompletionType.BASIC,
                PlatformPatterns.psiElement(LatexTypes.COMMAND_TOKEN).andNot(PlatformPatterns.psiElement().inside(LatexMathEnvironment.class)).withLanguage(LatexLanguage.INSTANCE),
                new LatexCommandProvider(LatexMode.NORMAL)
        );
    }
}
