// This is a generated file. Not intended for manual editing.
package tigase.idea.tdsl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TDSLValue extends PsiElement {

  @NotNull
  List<TDSLEnvFunction> getEnvFunctionList();

  @Nullable
  TDSLListValue getListValue();

  @Nullable
  PsiElement getBoolean();

}
