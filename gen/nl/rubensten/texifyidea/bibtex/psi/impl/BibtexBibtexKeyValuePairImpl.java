// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.bibtex.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.rubensten.texifyidea.bibtex.psi.*;

public class BibtexBibtexKeyValuePairImpl extends ASTWrapperPsiElement implements BibtexBibtexKeyValuePair {

  public BibtexBibtexKeyValuePairImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BibtexVisitor visitor) {
    visitor.visitBibtexKeyValuePair(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BibtexVisitor) accept((BibtexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public BibtexBibtexKey getBibtexKey() {
    return findNotNullChildByClass(BibtexBibtexKey.class);
  }

  @Override
  @NotNull
  public BibtexBibtexValue getBibtexValue() {
    return findNotNullChildByClass(BibtexBibtexValue.class);
  }

}