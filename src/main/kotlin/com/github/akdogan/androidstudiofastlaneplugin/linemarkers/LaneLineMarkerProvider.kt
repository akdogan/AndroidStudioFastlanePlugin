package com.github.akdogan.androidstudiofastlaneplugin.linemarkers

import com.github.akdogan.androidstudiofastlaneplugin.language.FastLaneIcons
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerProvider
import com.intellij.codeInsight.navigation.NavigationGutterIconBuilder
import com.intellij.openapi.editor.TextAnnotationGutterProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiPlainTextFile
import org.jetbrains.uast.test.env.findUElementByTextFromPsi

class LaneLineMarkerProvider : RelatedItemLineMarkerProvider() {


    override fun collectNavigationMarkers(
        element: PsiElement,
        result: MutableCollection<in RelatedItemLineMarkerInfo<*>>
    ) {
        println("Arif received element LANG=${element.language} num of children = ${element.children.size}")

//        element.containingFile.text

        val builder: NavigationGutterIconBuilder<PsiElement> = NavigationGutterIconBuilder.create(FastLaneIcons.EXECUTE)
            .setTooltipText("This button does not do anything yet, but hopefully soon")
            .setTargets()

        result.add(builder.createLineMarkerInfo(element))


    }
}
