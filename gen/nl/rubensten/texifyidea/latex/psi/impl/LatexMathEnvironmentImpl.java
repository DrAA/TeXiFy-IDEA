// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.latex.psi.impl;

import nl.rubensten.texifyidea.latex.psi.LatexDisplayMath;
import nl.rubensten.texifyidea.latex.psi.LatexInlineMath;
import nl.rubensten.texifyidea.latex.psi.LatexMathEnvironment;
import nl.rubensten.texifyidea.latex.psi.LatexVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.rubensten.texifyidea.psi.*;

public class LatexMathEnvironmentImpl extends ASTWrapperPsiElement implements LatexMathEnvironment {

  public LatexMathEnvironmentImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LatexVisitor visitor) {
    visitor.visitMathEnvironment(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatexVisitor) accept((LatexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LatexDisplayMath getDisplayMath() {
    return findChildByClass(LatexDisplayMath.class);
  }

  @Override
  @Nullable
  public LatexInlineMath getInlineMath() {
    return findChildByClass(LatexInlineMath.class);
  }

}
