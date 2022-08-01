@file:JsModule("webextension-polyfill")
@file:JsQualifier("history")

package browser.history

public external interface UrlDetails {
  /**
   * The URL for the operation. It must be in the format as returned from a call to history.search.
   */
  public var url: String
}
