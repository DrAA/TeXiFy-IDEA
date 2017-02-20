// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.latex.psi.impl;

import nl.rubensten.texifyidea.latex.psi.LatexComment;
import nl.rubensten.texifyidea.latex.psi.LatexVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static nl.rubensten.texifyidea.latex.psi.LatexTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.rubensten.texifyidea.latex.psi.*;

public class LatexCommentImpl extends ASTWrapperPsiElement implements LatexComment {

  public LatexCommentImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LatexVisitor visitor) {
    visitor.visitComment(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatexVisitor) accept((LatexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getCommentToken() {
    return findNotNullChildByType(COMMENT_TOKEN);
  }

}