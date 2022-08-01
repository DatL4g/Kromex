@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

/**
 * Fired when a tab is closed.
 */
public external interface OnRemovedListener {
  public var tabId: Int

  public var removeInfo: RemoveInfoProperty
}
