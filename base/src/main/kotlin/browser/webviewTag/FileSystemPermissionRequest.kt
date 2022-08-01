@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * The type of <code>request</code> object which accompanies a <code>filesystem</code> <a
 * href="#event-permissionrequest">permissionrequest</a></code> DOM event.
 */
public external interface FileSystemPermissionRequest {
  /**
   * The URL of the frame requesting access to local file system.
   */
  public var url: String

  /**
   * Allow the permission request.
   */
  public fun allow(): Nothing

  /**
   * Deny the permission request.
   */
  public fun deny(): Nothing
}
