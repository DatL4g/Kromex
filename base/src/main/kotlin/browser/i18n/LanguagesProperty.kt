@file:JsModule("webextension-polyfill")
@file:JsQualifier("i18n")

package browser.i18n

public external interface LanguagesProperty {
  public var language: LanguageCode

  /**
   * The percentage of the detected language
   */
  public var percentage: Int
}
