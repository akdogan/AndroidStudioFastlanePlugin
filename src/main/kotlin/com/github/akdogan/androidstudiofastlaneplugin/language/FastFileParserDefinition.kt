package com.github.akdogan.androidstudiofastlaneplugin.language

import com.github.akdogan.androidstudiofastlaneplugin.language.lexer.SimpleLexerAdapter
import com.github.akdogan.androidstudiofastlaneplugin.language.parser.FastParser
import com.github.akdogan.androidstudiofastlaneplugin.language.psi.FastLaneTypes
import com.github.akdogan.androidstudiofastlaneplugin.language.psi.FastTokenSets
import com.github.akdogan.androidstudiofastlaneplugin.language.psielements.SimpleFile
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

internal class FastFileParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer {
        return SimpleLexerAdapter()
    }

    override fun createParser(project: Project): PsiParser {
        return FastParser()
    }

    override fun getCommentTokens(): TokenSet {
        return FastTokenSets.COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return SimpleFile(viewProvider)
    }

    override fun createElement(node: ASTNode): PsiElement {
        return FastLaneTypes.Factory.createElement(node)
    }

    companion object {
        val FILE: IFileElementType = IFileElementType(FastLaneLanguage.INSTANCE)
    }
}