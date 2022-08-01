@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * The type of <code>request</code> object which accompanies a <code>fullscreen</code> <a
 * href="#event-permissionrequest">permissionrequest</a> DOM event.<p>
 */
public external interface FullscreenPermissionRequest {
  /**
   * The origin of the frame inside the <code>webview</code> that initiated the fullscreen request.
   */
  public var origin: String

  /**
   * Allow the permission request.
   */
  public fun allow(): Nothing

  /**
   * Deny the permission request.
   */
  public fun deny(): Nothing
}
