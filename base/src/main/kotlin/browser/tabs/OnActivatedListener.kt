@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

/**
 * Fires when the active tab in a window changes. Note that the tab's URL may not be set at the time
 * this event fired, but you can listen to onUpdated events so as to be notified when a URL is set.
 */
public external interface OnActivatedListener {
  public var activeInfo: ActiveInfoProperty
}
