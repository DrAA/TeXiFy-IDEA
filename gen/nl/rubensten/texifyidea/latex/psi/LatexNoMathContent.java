// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.latex.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LatexNoMathContent extends PsiElement {

  @Nullable
  LatexCommands getCommands();

  @Nullable
  LatexComment getComment();

  @Nullable
  LatexGroup getGroup();

  @Nullable
  LatexOpenGroup getOpenGroup();

  @Nullable
  PsiElement getNormalText();

}
