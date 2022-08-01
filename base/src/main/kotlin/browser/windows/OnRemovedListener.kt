@file:JsModule("webextension-polyfill")
@file:JsQualifier("windows")

package browser.windows

/**
 * Fired when a window is removed (closed).
 */
public external interface OnRemovedListener {
  /**
   * ID of the removed window.
   */
  public var windowId: Int
}
