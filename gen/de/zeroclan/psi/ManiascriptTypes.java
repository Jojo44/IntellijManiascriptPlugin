// This is a generated file. Not intended for manual editing.
package de.zeroclan.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.zeroclan.psi.impl.*;

public interface ManiascriptTypes {

  IElementType PROPERTY = new ManiascriptElementType("PROPERTY");

  IElementType COMMENT = new ManiascriptTokenType("COMMENT");
  IElementType CRLF = new ManiascriptTokenType("CRLF");
  IElementType KEY = new ManiascriptTokenType("KEY");
  IElementType SEPARATOR = new ManiascriptTokenType("SEPARATOR");
  IElementType VALUE = new ManiascriptTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new ManiascriptPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
