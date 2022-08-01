@file:JsModule("webextension-polyfill")
@file:JsQualifier("action")

package browser.action

import browser.tabs.Tab

/**
 * Fired when an action icon is clicked.  This event will not fire if the action has a popup.
 */
public external interface OnClickedListener {
  public var tab: Tab
}
