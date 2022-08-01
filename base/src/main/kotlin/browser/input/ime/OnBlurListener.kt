@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

/**
 * This event is sent when focus leaves a text box. It is sent to all extensions that are listening
 * to this event, and enabled by the user.
 */
public external interface OnBlurListener {
  /**
   * The ID of the text field that has lost focus. The ID is invalid after this call
   */
  public var contextID: Int
}
