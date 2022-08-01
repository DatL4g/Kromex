@file:JsModule("webextension-polyfill")
@file:JsQualifier("browserAction")

package browser.browserAction

import browser.tabs.Tab

/**
 * Fired when a browser action icon is clicked. Does not fire if the browser action has a popup.
 */
public external interface OnClickedListener {
  public var tab: Tab
}
