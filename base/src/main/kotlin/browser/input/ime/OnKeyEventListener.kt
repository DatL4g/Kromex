@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

/**
 * Fired when a key event is sent from the operating system. The event will be sent to the extension
 * if this extension owns the active IME. The listener function should return true if the event was
 * handled false if it was not.  If the event will be evaluated asynchronously, this function must
 * return undefined and the IME must later call keyEventHandled() with the result.
 */
public external interface OnKeyEventListener {
  /**
   * ID of the engine receiving the event
   */
  public var engineID: String

  /**
   * Data on the key event
   */
  public var keyData: KeyboardEvent

  /**
   * ID of the request. If the event listener returns undefined, then <code>keyEventHandled</code>
   * must be called later with this <code>requestId</code>.
   */
  public var requestId: String
}
