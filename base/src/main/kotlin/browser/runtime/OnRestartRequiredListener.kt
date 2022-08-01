@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime

/**
 * Fired when an app or the device that it runs on needs to be restarted. The app should close all
 * its windows at its earliest convenient time to let the restart to happen. If the app does nothing, a
 * restart will be enforced after a 24-hour grace period has passed. Currently, this event is only
 * fired for Chrome OS kiosk apps.
 */
public external interface OnRestartRequiredListener {
  /**
   * The reason that the event is being dispatched.
   */
  public var reason: OnRestartRequiredReason
}
