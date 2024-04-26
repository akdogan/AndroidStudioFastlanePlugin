package com.github.akdogan.androidstudiofastlaneplugin.language.psi

import com.github.akdogan.androidstudiofastlaneplugin.language.FastLaneLanguage
import com.intellij.psi.tree.IElementType

class FastLaneElementType(debugName: String): IElementType(debugName, FastLaneLanguage.INSTANCE)