@file:JsModule("webextension-polyfill")
@file:JsQualifier("webNavigation")

package browser.webNavigation

/**
 * Information about the tab to retrieve all frames from.
 */
public external interface GetAllFramesDetails {
  /**
   * The ID of the tab.
   */
  public var tabId: Int
}
