// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.bibtex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BibtexCommands extends PsiElement {

  @NotNull
  List<BibtexParameter> getParameterList();

  @NotNull
  PsiElement getCommandToken();

}