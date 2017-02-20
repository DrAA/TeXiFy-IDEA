// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.bibtex.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static nl.rubensten.texifyidea.bibtex.psi.BibtexTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.rubensten.texifyidea.bibtex.psi.*;

public class BibtexNoMathContentImpl extends ASTWrapperPsiElement implements BibtexNoMathContent {

  public BibtexNoMathContentImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BibtexVisitor visitor) {
    visitor.visitNoMathContent(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BibtexVisitor) accept((BibtexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BibtexCommands getCommands() {
    return findChildByClass(BibtexCommands.class);
  }

  @Override
  @Nullable
  public BibtexComment getComment() {
    return findChildByClass(BibtexComment.class);
  }

  @Override
  @Nullable
  public BibtexGroup getGroup() {
    return findChildByClass(BibtexGroup.class);
  }

  @Override
  @Nullable
  public BibtexOpenGroup getOpenGroup() {
    return findChildByClass(BibtexOpenGroup.class);
  }

  @Override
  @Nullable
  public PsiElement getNormalText() {
    return findChildByType(NORMAL_TEXT);
  }

}