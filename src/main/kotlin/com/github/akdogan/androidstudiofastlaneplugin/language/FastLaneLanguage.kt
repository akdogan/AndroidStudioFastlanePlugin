package com.github.akdogan.androidstudiofastlaneplugin.language

import com.intellij.icons.AllIcons
import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class FastLaneLanguage private constructor() : Language("FastLang") {

    override fun getID(): String {
        return "FastLang"
    }

    companion object {
        val INSTANCE = FastLaneLanguage()
    }
}

object FastLaneIcons {
    val FILE: Icon = AllIcons.Diff.Compare3LeftMiddle
    val EXECUTE: Icon = AllIcons.Actions.Execute
}

class FastLaneFileType private constructor(): LanguageFileType(FastLaneLanguage.INSTANCE) {

    companion object {
        val INSTANCE: FastLaneFileType = FastLaneFileType()
    }

    override fun getName(): String {
        return "FastFile"
    }

    override fun getDescription(): String {
        return "FastLane fast file"
    }

    override fun getDefaultExtension(): String {
        return "fast"
    }

    override fun getIcon(): Icon {
        return FastLaneIcons.FILE
    }
}
