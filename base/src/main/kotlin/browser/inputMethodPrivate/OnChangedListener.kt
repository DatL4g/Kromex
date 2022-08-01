@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

/**
 * Fired when the input method is changed.
 */
public external interface OnChangedListener {
  /**
   * New input method which is being used.
   */
  public var newInputMethodId: String
}
