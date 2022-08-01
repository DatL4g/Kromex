@file:JsModule("webextension-polyfill")
@file:JsQualifier("windows")

package browser.windows

/**
 * Fired when the currently focused window changes. Returns
 * <code>chrome.windows.WINDOW_ID_NONE</code> if all Chrome windows have lost focus. <b>Note:</b> On
 * some Linux window managers, <code>WINDOW_ID_NONE</code> is always sent immediately preceding a
 * switch from one Chrome window to another.
 */
public external interface OnFocusChangedListener {
  /**
   * ID of the newly-focused window.
   */
  public var windowId: Int
}
