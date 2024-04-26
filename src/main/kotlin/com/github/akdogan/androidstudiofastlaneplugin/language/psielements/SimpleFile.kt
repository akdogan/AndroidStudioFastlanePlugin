package com.github.akdogan.androidstudiofastlaneplugin.language.psielements

import com.github.akdogan.androidstudiofastlaneplugin.language.FastLaneFileType
import com.github.akdogan.androidstudiofastlaneplugin.language.FastLaneLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class SimpleFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, FastLaneLanguage.INSTANCE) {

    override fun  getFileType(): FileType {
        return FastLaneFileType.INSTANCE
    }

    override fun toString(): String {
        return "FastFile"
    }
}