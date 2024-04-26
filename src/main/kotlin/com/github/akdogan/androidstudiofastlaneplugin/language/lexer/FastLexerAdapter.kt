package com.github.akdogan.androidstudiofastlaneplugin.language.lexer

import com.intellij.lexer.FlexAdapter

class SimpleLexerAdapter : FlexAdapter(FastLexer(null))