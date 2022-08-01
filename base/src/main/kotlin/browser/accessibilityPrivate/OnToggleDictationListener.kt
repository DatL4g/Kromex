@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityPrivate")

package browser.accessibilityPrivate

/**
 * Fired when Dictation is activated or deactivated using a keyboard shortcut, the button in the
 * tray, or after a call from accessibilityPrivate.toggleDictation
 */
public external interface OnToggleDictationListener {
  /**
   * True if Dictation was activated, false if it was deactivated.
   */
  public var activated: Boolean
}
