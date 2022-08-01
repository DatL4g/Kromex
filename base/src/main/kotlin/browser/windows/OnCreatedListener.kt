@file:JsModule("webextension-polyfill")
@file:JsQualifier("windows")

package browser.windows

/**
 * Fired when a window is created.
 */
public external interface OnCreatedListener {
  /**
   * Details of the created window.
   */
  public var window: Window
}
