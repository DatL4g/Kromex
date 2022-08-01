@file:JsModule("webextension-polyfill")
@file:JsQualifier("permissions")

package browser.permissions

/**
 * Fired when the extension acquires new permissions.
 */
public external interface OnAddedListener {
  /**
   * The newly acquired permissions.
   */
  public var permissions: Permissions
}
