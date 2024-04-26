package com.github.akdogan.androidstudiofastlaneplugin.language.psi

import com.github.akdogan.androidstudiofastlaneplugin.language.FastLaneLanguage
import com.intellij.psi.tree.IElementType

class FastLaneTokenType(debugName: String) : IElementType(debugName, FastLaneLanguage.INSTANCE) {

    override fun toString(): String {
        return "SimpleTokenType." + super.toString()
    }
}



