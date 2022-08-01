@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

/**
 * This event is sent when input method options are changed.
 */
public external interface OnInputMethodOptionsChangedListener {
  /**
   * The engine ID for the input method being changed.
   */
  public var engineID: String
}
