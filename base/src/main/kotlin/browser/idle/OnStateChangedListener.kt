@file:JsModule("webextension-polyfill")
@file:JsQualifier("idle")

package browser.idle

/**
 * Fired when the system changes to an active, idle or locked state. The event fires with "locked"
 * if the screen is locked or the screensaver activates, "idle" if the system is unlocked and the user
 * has not generated any input for a specified number of seconds, and "active" when the user generates
 * input on an idle system.
 */
public external interface OnStateChangedListener {
  public var newState: IdleState
}
