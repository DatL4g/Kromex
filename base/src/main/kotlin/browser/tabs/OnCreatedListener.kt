@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

/**
 * Fired when a tab is created. Note that the tab's URL and tab group membership may not be set at
 * the time this event is fired, but you can listen to onUpdated events so as to be notified when a URL
 * is set or the tab is added to a tab group.
 */
public external interface OnCreatedListener {
  /**
   * Details of the tab that was created.
   */
  public var tab: Tab
}
