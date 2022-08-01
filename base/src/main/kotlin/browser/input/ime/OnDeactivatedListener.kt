@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

/**
 * This event is sent when an IME is deactivated. It signals that the IME will no longer be
 * receiving onKeyPress events.
 */
public external interface OnDeactivatedListener {
  /**
   * ID of the engine receiving the event
   */
  public var engineID: String
}
