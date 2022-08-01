@file:JsModule("webextension-polyfill")
@file:JsQualifier("permissions")

package browser.permissions

public external interface Permissions {
  /**
   * List of named permissions (does not include hosts or origins).
   */
  public var permissions: Array<String>?

  /**
   * The list of host permissions, including those specified in the
   * <code>optional_permissions</code> or <code>permissions</code> keys in the manifest, and those
   * associated with <a href='content_scripts'>Content Scripts</a>.
   */
  public var origins: Array<String>?
}
