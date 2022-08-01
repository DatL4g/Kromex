@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

/**
 * This event is sent when a touch occurs in a text field. Should only happen after onFocus()
 */
public external interface OnTouchListener {
  /**
   * Pointer type used to touch the text field
   */
  public var pointerType: FocusReason
}
