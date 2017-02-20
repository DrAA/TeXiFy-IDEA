// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.latex.psi.impl;

import java.util.List;

import nl.rubensten.texifyidea.latex.psi.LatexDisplayMath;
import nl.rubensten.texifyidea.latex.psi.LatexNoMathContent;
import nl.rubensten.texifyidea.latex.psi.LatexVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.rubensten.texifyidea.latex.psi.*;

public class LatexDisplayMathImpl extends ASTWrapperPsiElement implements LatexDisplayMath {

  public LatexDisplayMathImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LatexVisitor visitor) {
    visitor.visitDisplayMath(this);
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