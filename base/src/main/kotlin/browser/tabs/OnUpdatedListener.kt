@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

/**
 * Fired when a tab is updated.
 */
public external interface OnUpdatedListener {
  public var tabId: Int

  /**
   * Lists the changes to the state of the tab that was updated.
   */
  public var changeInfo: ChangeInfoProperty

  /**
   * Gives the state of the tab that was updated.
   */
  public var tab: Tab
}
