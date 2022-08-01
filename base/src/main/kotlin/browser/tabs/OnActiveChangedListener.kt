@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

/**
 * Fires when the selected tab in a window changes. Note that the tab's URL may not be set at the
 * time this event fired, but you can listen to $(ref:tabs.onUpdated) events so as to be notified when
 * a URL is set.
 */
public external interface OnActiveChangedListener {
  /**
   * The ID of the tab that has become active.
   */
  public var tabId: Int

  public var selectInfo: SelectInfoProperty
}
