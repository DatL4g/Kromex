@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

/**
 * This event is sent when chrome terminates ongoing text input session.
 */
public external interface OnResetListener {
  /**
   * ID of the engine receiving the event
   */
  public var engineID: String
}
