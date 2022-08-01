@file:JsModule("webextension-polyfill")
@file:JsQualifier("webViewInternal")

package browser.webViewInternal

public external interface FindOptions {
  /**
   * Flag to find matches in reverse order.
   */
  public var backward: Boolean?

  /**
   * Flag to match |searchText| with case-sensitivity.
   */
  public var matchCase: Boolean?
}
