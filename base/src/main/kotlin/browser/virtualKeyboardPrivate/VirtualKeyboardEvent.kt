@file:JsModule("webextension-polyfill")
@file:JsQualifier("virtualKeyboardPrivate")

package browser.virtualKeyboardPrivate

public external interface VirtualKeyboardEvent {
  public var type: VirtualKeyboardEventType

  /**
   * Unicode value of the key.
   */
  public var charValue: Int

  /**
   * Virtual key code, which is independent of the keyboard layout or modifier state.
   */
  public var keyCode: Int

  /**
   * Name of the key, which is independent of modifier state.
   */
  public var keyName: String

  /**
   * Flag for modifiers that are active. None = 0, Shift = 2, Control = 4, Alt = 8.
   */
  public var modifiers: Int?
}
