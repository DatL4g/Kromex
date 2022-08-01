@file:JsModule("webextension-polyfill")
@file:JsQualifier("types")

package browser.types

/**
 * Which setting to clear.
 */
public external interface ClearDetails {
  /**
   * Where to clear the setting (default: regular).
   */
  public var scope: ChromeSettingScope?
}
