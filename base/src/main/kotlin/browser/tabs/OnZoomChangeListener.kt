@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

/**
 * Fired when a tab is zoomed.
 */
public external interface OnZoomChangeListener {
  public var ZoomChangeInfo: ZoomChangeInfoProperty
}
