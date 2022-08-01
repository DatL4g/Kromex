@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Options for the find request.
 */
public external interface FindOptions {
  /**
   * Flag to find matches in reverse order. The default value is <code>false</code>.
   */
  public var backward: Boolean?

  /**
   * Flag to match with case-sensitivity. The default value is <code>false</code>.
   */
  public var matchCase: Boolean?
}
