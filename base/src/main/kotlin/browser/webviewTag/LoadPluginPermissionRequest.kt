@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * The type of <code>request</code> object which accompanies a <code>loadplugin</code> <a
 * href="#event-permissionrequest">permissionrequest</a> DOM event.<p>
 */
public external interface LoadPluginPermissionRequest {
  /**
   * The plugin's identifier string.
   */
  public var identifier: String

  /**
   * The plugin's display name.
   */
  public var name: String

  /**
   * Allow the permission request. This is the default behavior if <code>deny</code> is not called..
   */
  public fun allow(): Nothing

  /**
   * Deny the permission request.
   */
  public fun deny(): Nothing
}
