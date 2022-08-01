@file:JsModule("webextension-polyfill")
@file:JsQualifier("i18n")

package browser.i18n

/**
 * LanguageDetectionResult object that holds detected langugae reliability and array of
 * DetectedLanguage
 */
public external interface DetectLanguageReturn {
  /**
   * CLD detected language reliability
   */
  public var isReliable: Boolean

  /**
   * array of detectedLanguage
   */
  public var languages: Array<LanguagesProperty>
}
