package com.github.akdogan.androidstudiofastlaneplugin.language.psi;

import com.intellij.psi.tree.TokenSet;

public interface FastTokenSets {

  TokenSet IDENTIFIERS = TokenSet.create(FastLaneTypes.KEY);

  TokenSet COMMENTS = TokenSet.create(FastLaneTypes.COMMENT);

}