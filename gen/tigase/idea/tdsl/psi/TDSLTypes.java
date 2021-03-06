// This is a generated file. Not intended for manual editing.
package tigase.idea.tdsl.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import tigase.idea.tdsl.psi.impl.*;

public interface TDSLTypes {

  IElementType BEAN = new TDSLElementType("BEAN");
  IElementType BEAN_CFG = new TDSLElementType("BEAN_CFG");
  IElementType BEAN_CFG_PROP_PAIR = new TDSLElementType("BEAN_CFG_PROP_PAIR");
  IElementType BEAN_CONTENT = new TDSLElementType("BEAN_CONTENT");
  IElementType ENV_FUNCTION = new TDSLElementType("ENV_FUNCTION");
  IElementType LIST_VALUE = new TDSLElementType("LIST_VALUE");
  IElementType PROP = new TDSLElementType("PROP");
  IElementType VALUE = new TDSLElementType("VALUE");

  IElementType ASSIGNMENT = new TDSLTokenType("ASSIGNMENT");
  IElementType BEANCFGPROPNAME = new TDSLTokenType("beanCfgPropName");
  IElementType BEANCFGPROPVALUE = new TDSLTokenType("beanCfgPropValue");
  IElementType BEANNAME = new TDSLTokenType("beanName");
  IElementType BOOLEAN = new TDSLTokenType("boolean");
  IElementType COLON = new TDSLTokenType(":");
  IElementType COMMA = new TDSLTokenType(",");
  IElementType COMMENT = new TDSLTokenType("COMMENT");
  IElementType ENVPROPFNNAME = new TDSLTokenType("envPropFnName");
  IElementType LBRACK = new TDSLTokenType("[");
  IElementType LCURLY = new TDSLTokenType("{");
  IElementType LPAREN = new TDSLTokenType("(");
  IElementType NUMBER = new TDSLTokenType("number");
  IElementType OPERATORADD = new TDSLTokenType("+");
  IElementType OPERATORDIVIDE = new TDSLTokenType("/");
  IElementType OPERATORMULTIPLY = new TDSLTokenType("*");
  IElementType OPERATORSUBSTRACT = new TDSLTokenType("-");
  IElementType PROPNAME = new TDSLTokenType("propName");
  IElementType RBRACK = new TDSLTokenType("]");
  IElementType RCURLY = new TDSLTokenType("}");
  IElementType RPAREN = new TDSLTokenType(")");
  IElementType STRING = new TDSLTokenType("string");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == BEAN) {
        return new TDSLBeanImpl(node);
      }
      else if (type == BEAN_CFG) {
        return new TDSLBeanCfgImpl(node);
      }
      else if (type == BEAN_CFG_PROP_PAIR) {
        return new TDSLBeanCfgPropPairImpl(node);
      }
      else if (type == BEAN_CONTENT) {
        return new TDSLBeanContentImpl(node);
      }
      else if (type == ENV_FUNCTION) {
        return new TDSLEnvFunctionImpl(node);
      }
      else if (type == LIST_VALUE) {
        return new TDSLListValueImpl(node);
      }
      else if (type == PROP) {
        return new TDSLPropImpl(node);
      }
      else if (type == VALUE) {
        return new TDSLValueImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
