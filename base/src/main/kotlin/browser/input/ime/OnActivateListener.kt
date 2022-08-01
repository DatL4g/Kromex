@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

/**
 * This event is sent when an IME is activated. It signals that the IME will be receiving onKeyPress
 * events.
 */
public external interface OnActivateListener {
  /**
   * ID of the engine receiving the event
   */
  public var engineID: String

  /**
   * The screen type under which the IME is activated.
   */
  public var screen: ScreenType
}
