@file:JsModule("webextension-polyfill")
@file:JsQualifier("management")

package browser.management

/**
 * Fired when an app or extension has been enabled.
 */
public external interface OnEnabledListener {
  public var info: ExtensionInfo
}
