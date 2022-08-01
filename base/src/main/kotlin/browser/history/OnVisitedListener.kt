@file:JsModule("webextension-polyfill")
@file:JsQualifier("history")

package browser.history

/**
 * Fired when a URL is visited, providing the HistoryItem data for that URL.  This event fires
 * before the page has loaded.
 */
public external interface OnVisitedListener {
  public var result: HistoryItem
}
