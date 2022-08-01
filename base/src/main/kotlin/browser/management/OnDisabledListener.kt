@file:JsModule("webextension-polyfill")
@file:JsQualifier("management")

package browser.management

/**
 * Fired when an app or extension has been disabled.
 */
public external interface OnDisabledListener {
  public var info: ExtensionInfo
}
