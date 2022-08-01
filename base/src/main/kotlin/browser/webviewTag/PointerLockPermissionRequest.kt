@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * The type of <code>request</code> object which accompanies a <code>pointerLock</code> <a
 * href="#event-permissionrequest">permissionrequest</a></code> DOM event.
 */
public external interface PointerLockPermissionRequest {
  /**
   * Whether or not pointer lock was requested as a result of a user input gesture.
   */
  public var userGesture: Boolean

  /**
   * Whether or not the requesting frame was the most recent client to hold pointer lock.
   */
  public var lastUnlockedBySelf: Boolean

  /**
   * The URL of the frame requesting pointer lock.
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
