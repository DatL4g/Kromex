@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Fired when the guest page needs to request special permission from the embedder.<p>The following
 * example code will grant the guest page access to the <code>webkitGetUserMedia</code> API. Note that
 * an app using this example code must itself specify <code>audioCapture</code> and/or
 * <code>videoCapture</code> manifest
 * permissions:</p><pre>webview.addEventListener('permissionrequest', function(e) {  if (e.permission
 * === 'media') {    e.request.allow();  }});</pre>
 */
public external interface PermissionrequestListener {
  /**
   * The type of permission being requested.
   */
  public var permission: String

  /**
   * An object which holds details of the requested permission. Depending on the type of permission
   * requested, this may be a $(ref:webviewTag.MediaPermissionRequest),
   * $(ref:webviewTag.GeolocationPermissionRequest), $(ref:webviewTag.PointerLockPermissionRequest),
   * $(ref:webviewTag.DownloadPermissionRequest), $(ref:webviewTag.LoadPluginPermissionRequest), or
   * $(ref:webviewTag.FullscreenPermissionRequest).
   */
  public var request: Any
}
