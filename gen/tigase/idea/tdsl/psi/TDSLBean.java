// This is a generated file. Not intended for manual editing.
package tigase.idea.tdsl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TDSLBean extends PsiElement {

  @NotNull
  List<TDSLBean> getBeanList();

  @Nullable
  TDSLBeanCfg getBeanCfg();

  @NotNull
  List<TDSLProp> getPropList();

  @NotNull
  PsiElement getBeanName();

}
