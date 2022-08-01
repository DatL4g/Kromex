@file:JsModule("webextension-polyfill")
@file:JsQualifier("pageAction")

package browser.pageAction

public external interface SetPopupDetails {
  /**
   * The id of the tab for which you want to modify the page action.
   */
  public var tabId: Int

  /**
   * The relative path to the HTML file to show in a popup. If set to the empty string
   * (<code>''</code>), no popup is shown.
   */
  public var popup: String
}
