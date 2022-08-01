@file:JsModule("webextension-polyfill")
@file:JsQualifier("pageAction")

package browser.pageAction

public external interface SetTitleDetails {
  /**
   * The id of the tab for which you want to modify the page action.
   */
  public var tabId: Int

  /**
   * The tooltip string.
   */
  public var title: String
}
