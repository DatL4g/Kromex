@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

public external interface ActiveInfoProperty {
  /**
   * The ID of the tab that has become active.
   */
  public var tabId: Int

  /**
   * The ID of the window the active tab changed inside of.
   */
  public var windowId: Int
}
