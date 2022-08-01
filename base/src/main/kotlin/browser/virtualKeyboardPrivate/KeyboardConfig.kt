@file:JsModule("webextension-polyfill")
@file:JsQualifier("virtualKeyboardPrivate")

package browser.virtualKeyboardPrivate

public external interface KeyboardConfig {
  /**
   * Virtual keyboard layout string.
   */
  public var layout: String

  /**
   * Virtual keyboard is in hotrod mode.
   */
  public var hotrodmode: Boolean

  /**
   * True if accessibility virtual keyboard is enabled.
   */
  public var a11ymode: Boolean

  /**
   * List of experimental feature flags.
   */
  public var features: Array<String>
}
