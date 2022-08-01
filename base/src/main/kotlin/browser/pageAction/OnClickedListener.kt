@file:JsModule("webextension-polyfill")
@file:JsQualifier("pageAction")

package browser.pageAction

import browser.tabs.Tab

/**
 * Fired when a page action icon is clicked.  This event will not fire if the page action has a
 * popup.
 */
public external interface OnClickedListener {
  public var tab: Tab
}
