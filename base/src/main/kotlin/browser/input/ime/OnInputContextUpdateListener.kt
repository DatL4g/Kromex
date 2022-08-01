@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

/**
 * This event is sent when the properties of the current InputContext change, such as the the type.
 * It is sent to all extensions that are listening to this event, and enabled by the user.
 */
public external interface OnInputContextUpdateListener {
  /**
   * An InputContext object describing the text field that has changed.
   */
  public var context: InputContext
}
