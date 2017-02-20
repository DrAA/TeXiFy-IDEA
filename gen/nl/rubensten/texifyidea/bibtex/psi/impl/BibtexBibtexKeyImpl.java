// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.bibtex.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static nl.rubensten.texifyidea.bibtex.psi.BibtexTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.rubensten.texifyidea.bibtex.psi.*;

public class BibtexBibtexKeyImpl extends ASTWrapperPsiElement implements BibtexBibtexKey {

  public BibtexBibtexKeyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BibtexVisitor visitor) {
    visitor.visitBibtexKey(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BibtexVisitor) accept((BibtexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getCitationKey() {
    return findNotNullChildByType(CITATION_KEY);
  }

}