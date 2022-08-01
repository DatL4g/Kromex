@file:JsModule("webextension-polyfill")
@file:JsQualifier("commands")

package browser.commands

import browser.tabs.Tab

/**
 * Fired when a registered command is activated using a keyboard shortcut.
 */
public external interface OnCommandListener {
  public var command: String

  public var tab: Tab?
}
