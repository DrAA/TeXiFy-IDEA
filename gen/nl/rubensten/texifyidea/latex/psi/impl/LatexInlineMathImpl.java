// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.latex.psi.impl;

import java.util.List;

import nl.rubensten.texifyidea.latex.psi.LatexInlineMath;
import nl.rubensten.texifyidea.latex.psi.LatexNoMathContent;
import nl.rubensten.texifyidea.latex.psi.LatexVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.rubensten.texifyidea.psi.*;

public class LatexInlineMathImpl extends ASTWrapperPsiElement implements LatexInlineMath {

  public LatexInlineMathImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LatexVisitor visitor) {
    visitor.visitInlineMath(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatexVisitor) accept((LatexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LatexNoMathContent> getNoMathContentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LatexNoMathContent.class);
  }

}
