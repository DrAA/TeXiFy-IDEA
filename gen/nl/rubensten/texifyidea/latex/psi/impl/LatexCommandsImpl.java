// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.latex.psi.impl;

import java.util.List;

import nl.rubensten.texifyidea.latex.psi.LatexCommands;
import nl.rubensten.texifyidea.latex.psi.LatexParameter;
import nl.rubensten.texifyidea.latex.psi.LatexTypes;
import nl.rubensten.texifyidea.latex.psi.LatexVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.rubensten.texifyidea.psi.*;

public class LatexCommandsImpl extends ASTWrapperPsiElement implements LatexCommands {

  public LatexCommandsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LatexVisitor visitor) {
    visitor.visitCommands(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatexVisitor) accept((LatexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LatexParameter> getParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LatexParameter.class);
  }

  @Override
  @NotNull
  public PsiElement getCommandToken() {
    return findNotNullChildByType(LatexTypes.COMMAND_TOKEN);
  }

}
