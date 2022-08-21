package com.lukasbrand.configuration_processor

import com.github.javaparser.StaticJavaParser
import com.github.javaparser.ast.CompilationUnit
import javax.annotation.processing.AbstractProcessor
import javax.annotation.processing.RoundEnvironment
import javax.lang.model.SourceVersion
import javax.lang.model.element.TypeElement
import javax.tools.Diagnostic

class ConfigurationProcessor : AbstractProcessor() {

    override fun process(annotations: MutableSet<out TypeElement>?, roundEnv: RoundEnvironment?): Boolean {
        annotations?.forEach {
            val annotatedElements = roundEnv?.getElementsAnnotatedWith(it)
            annotatedElements?.forEach {
                it.enclosingElement
                processingEnv.messager.printMessage(Diagnostic.Kind.WARNING, it.enclosingElement.toString())

            }

        }

        val createSourceFile = processingEnv.filer.createSourceFile("Test")

        val writer = createSourceFile.openWriter().use {
            it.write(CompilationUnit().addClass("Test").toString())
            it.flush()
        }



        return false

        //TODO("Not yet implemented")
    }

    override fun getSupportedAnnotationTypes(): MutableSet<String> {
        return mutableSetOf("com.lukasbrand.configuration_processor.annotations.Configuration")
    }

    override fun getSupportedSourceVersion(): SourceVersion {
        return SourceVersion.RELEASE_18
    }
}