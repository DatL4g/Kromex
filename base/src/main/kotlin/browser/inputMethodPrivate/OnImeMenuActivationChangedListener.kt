@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

/**
 * Fired when the IME menu is activated or deactivated.
 */
public external interface OnImeMenuActivationChangedListener {
  /**
   * Whether the IME menu is currently active.
   */
  public var activation: Boolean
}
