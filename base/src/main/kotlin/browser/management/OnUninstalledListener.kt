@file:JsModule("webextension-polyfill")
@file:JsQualifier("management")

package browser.management

/**
 * Fired when an app or extension has been uninstalled.
 */
public external interface OnUninstalledListener {
  /**
   * The id of the extension, app, or theme that was uninstalled.
   */
  public var id: String
}
