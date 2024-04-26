// This is a generated file. Not intended for manual editing.
package com.github.akdogan.androidstudiofastlaneplugin.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.akdogan.androidstudiofastlaneplugin.language.psi.impl.*;

public interface FastLaneTypes {

  IElementType PROPERTY = new FastLaneElementType("PROPERTY");

  IElementType COMMENT = new FastLaneTokenType("COMMENT");
  IElementType CRLF = new FastLaneTokenType("CRLF");
  IElementType KEY = new FastLaneTokenType("KEY");
  IElementType SEPARATOR = new FastLaneTokenType("SEPARATOR");
  IElementType VALUE = new FastLaneTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new FastPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
