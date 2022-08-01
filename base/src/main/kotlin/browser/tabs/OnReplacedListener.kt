@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

/**
 * Fired when a tab is replaced with another tab due to prerendering or instant.
 */
public external interface OnReplacedListener {
  public var addedTabId: Int

  public var removedTabId: Int
}
