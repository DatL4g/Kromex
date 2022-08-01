@file:JsModule("webextension-polyfill")
@file:JsQualifier("history")

package browser.history

/**
 * Fired when one or more URLs are removed from the history service.  When all visits have been
 * removed the URL is purged from history.
 */
public external interface OnVisitRemovedListener {
  public var removed: RemovedProperty
}
