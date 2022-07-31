package generator

import JsModule
import JsQualifier
import com.squareup.kotlinpoet.AnnotationSpec

object AnnotationGenerator {
    val POLYFILL_ANNOTATION = AnnotationSpec.builder(JsModule::class).addMember("%S", "webextension-polyfill").build()
    fun QUALIFIER_ANNOTATION(namespace: String) = AnnotationSpec.builder(JsQualifier::class).addMember("%S", namespace).build()
    val UNCHECK_CAST_TO_EXTERNAL_INTERFACE = AnnotationSpec.builder(Suppress::class).addMember("%S", "UNCHECKED_CAST_TO_EXTERNAL_INTERFACE").build()
}