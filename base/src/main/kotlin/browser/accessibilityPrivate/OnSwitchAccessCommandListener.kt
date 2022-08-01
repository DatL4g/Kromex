@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityPrivate")

package browser.accessibilityPrivate

/**
 * Fired when Chrome OS has received a key event corresponding to a Switch Access command.
 */
public external interface OnSwitchAccessCommandListener {
  public var command: SwitchAccessCommand
}
