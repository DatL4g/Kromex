@file:JsModule("webextension-polyfill")
@file:JsQualifier("debugger")

package browser.debugger

/**
 * Fired when browser terminates debugging session for the tab. This happens when either the tab is
 * being closed or Chrome DevTools is being invoked for the attached tab.
 */
public external interface OnDetachListener {
  /**
   * The debuggee that was detached.
   */
  public var source: Debuggee

  /**
   * Connection termination reason.
   */
  public var reason: DetachReason
}
