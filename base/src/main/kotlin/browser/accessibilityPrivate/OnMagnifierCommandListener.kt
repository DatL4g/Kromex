@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityPrivate")

package browser.accessibilityPrivate

/**
 * Fired when Chrome OS has received a key event corresponding to a Magnifier command.
 */
public external interface OnMagnifierCommandListener {
  public var command: MagnifierCommand
}
