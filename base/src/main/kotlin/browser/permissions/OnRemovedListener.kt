@file:JsModule("webextension-polyfill")
@file:JsQualifier("permissions")

package browser.permissions

/**
 * Fired when access to permissions has been removed from the extension.
 */
public external interface OnRemovedListener {
  /**
   * The permissions that have been removed.
   */
  public var permissions: Permissions
}
