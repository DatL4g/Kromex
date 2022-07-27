package generator

import com.squareup.kotlinpoet.FileSpec

object ImportFileGenerator {

    fun create(namespace: String): FileSpec.Builder {
        return FileSpec.builder("browser.${namespace}", "Import")
            .addAnnotation(
                AnnotationGenerator.POLYFILL_ANNOTATION
            )
            .addAnnotation(
                AnnotationGenerator.QUALIFIER_ANNOTATION(namespace)
            )
            .addKotlinDefaultImports(
                includeJvm = false,
                includeJs = true
            )
    }
}