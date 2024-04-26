// This is a generated file. Not intended for manual editing.
package com.github.akdogan.androidstudiofastlaneplugin.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.akdogan.androidstudiofastlaneplugin.language.psi.FastLaneTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.akdogan.androidstudiofastlaneplugin.language.psi.*;

public class FastPropertyImpl extends ASTWrapperPsiElement implements FastProperty {

  public FastPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FastVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FastVisitor) accept((FastVisitor)visitor);
    else super.accept(visitor);
  }

}
