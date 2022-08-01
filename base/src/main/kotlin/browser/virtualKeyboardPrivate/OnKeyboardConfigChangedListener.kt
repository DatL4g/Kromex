@file:JsModule("webextension-polyfill")
@file:JsQualifier("virtualKeyboardPrivate")

package browser.virtualKeyboardPrivate

/**
 * Fired when a configuration for virtual keyboard IME has changed, e.g. auto complete disabled.
 */
public external interface OnKeyboardConfigChangedListener {
  /**
   * The virtual keyboard config
   */
  public var config: KeyboardConfig
}
