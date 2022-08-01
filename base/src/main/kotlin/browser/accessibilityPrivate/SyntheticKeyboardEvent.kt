@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityPrivate")

package browser.accessibilityPrivate

public external interface SyntheticKeyboardEvent {
  public var type: SyntheticKeyboardEventType

  /**
   * Virtual key code, which is independent of the keyboard layout or modifier state.
   */
  public var keyCode: Int

  /**
   * Contains all active modifiers.
   */
  public var modifiers: SyntheticKeyboardModifiers?
}
