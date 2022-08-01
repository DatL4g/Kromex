@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

/**
 * Fired when a tab is moved within a window. Only one move event is fired, representing the tab the
 * user directly moved. Move events are not fired for the other tabs that must move in response to the
 * manually-moved tab. This event is not fired when a tab is moved between windows; for details, see
 * $(ref:tabs.onDetached).
 */
public external interface OnMovedListener {
  public var tabId: Int

  public var moveInfo: MoveInfoProperty
}
