@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

/**
 * This event is sent when focus enters a text box. It is sent to all extensions that are listening
 * to this event, and enabled by the user.
 */
public external interface OnFocusListener {
  /**
   * Describes the text field that has acquired focus.
   */
  public var context: InputContext
}
