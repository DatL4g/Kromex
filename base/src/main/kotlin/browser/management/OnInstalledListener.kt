@file:JsModule("webextension-polyfill")
@file:JsQualifier("management")

package browser.management

/**
 * Fired when an app or extension has been installed.
 */
public external interface OnInstalledListener {
  public var info: ExtensionInfo
}
