package generator

import com.squareup.kotlinpoet.FileSpec

object ConstructorFileGenerator {

    fun create(namespace: String): FileSpec.Builder {
        return FileSpec.builder("browser.${namespace}", "Constructor")
            .addAnnotation(AnnotationGenerator.UNCHECK_CAST_TO_EXTERNAL_INTERFACE)
            .addKotlinDefaultImports(
                includeJvm = false,
                includeJs = false
            )
    }
}