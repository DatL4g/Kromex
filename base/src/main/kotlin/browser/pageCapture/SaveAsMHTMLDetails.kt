@file:JsModule("webextension-polyfill")
@file:JsQualifier("pageCapture")

package browser.pageCapture

public external interface SaveAsMHTMLDetails {
  /**
   * The id of the tab to save as MHTML.
   */
  public var tabId: Int
}
