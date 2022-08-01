@file:JsModule("webextension-polyfill")
@file:JsQualifier("windows")

package browser.windows

/**
 * Fired when a window has been resized; this event is only dispatched when the new bounds are
 * committed, and not for in-progress changes.
 */
public external interface OnBoundsChangedListener {
  /**
   * Details of the window. The tabs will not be populated for the window.
   */
  public var window: Window
}
