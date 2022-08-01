@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * The type of <code>request</code> object which accompanies a <code>geolocation</code> <a
 * href="#event-permissionrequest">permissionrequest</a></code> DOM event.
 */
public external interface GeolocationPermissionRequest {
  /**
   * The URL of the frame requesting access to geolocation data.
   */
  public var url: String

  /**
   * Allow the permission request.
   */
  public fun allow(): Nothing

  /**
   * Deny the permission request. This is the default behavior if <code>allow</code> is not called.
   */
  public fun deny(): Nothing
}
