@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

/**
 * See http://www.w3.org/TR/DOM-Level-3-Events/#events-KeyboardEvent
 */
public external interface KeyboardEvent {
  /**
   * One of keyup or keydown.
   */
  public var type: KeyboardEventType

  /**
   * (Deprecated) The ID of the request. Use the <code>requestId</code> param from the
   * <code>onKeyEvent</code> event instead.
   */
  public var requestId: String?

  /**
   * The extension ID of the sender of this keyevent.
   */
  public var extensionId: String?

  /**
   * Value of the key being pressed
   */
  public var key: String

  /**
   * Value of the physical key being pressed. The value is not affected by current keyboard layout
   * or modifier state.
   */
  public var code: String

  /**
   * The deprecated HTML keyCode, which is system- and implementation-dependent numerical code
   * signifying the unmodified identifier associated with the key pressed.
   */
  public var keyCode: Int?

  /**
   * Whether or not the ALT key is pressed.
   */
  public var altKey: Boolean?

  /**
   * Whether or not the ALTGR key is pressed.
   */
  public var altgrKey: Boolean?

  /**
   * Whether or not the CTRL key is pressed.
   */
  public var ctrlKey: Boolean?

  /**
   * Whether or not the SHIFT key is pressed.
   */
  public var shiftKey: Boolean?

  /**
   * Whether or not the CAPS_LOCK is enabled.
   */
  public var capsLock: Boolean?
}
