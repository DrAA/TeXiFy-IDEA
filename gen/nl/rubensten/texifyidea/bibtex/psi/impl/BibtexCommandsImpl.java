// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.bibtex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.rubensten.texifyidea.bibtex.psi.BibtexTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.rubensten.texifyidea.bibtex.psi.*;

public class BibtexCommandsImpl extends ASTWrapperPsiElement implements BibtexCommands {

  public BibtexCommandsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BibtexVisitor visitor) {
    visitor.visitCommands(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BibtexVisitor) accept((BibtexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<BibtexParameter> getParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BibtexParameter.class);
  }

  @Override
  @NotNull
  public PsiElement getCommandToken() {
    return findNotNullChildByType(COMMAND_TOKEN);
  }

}