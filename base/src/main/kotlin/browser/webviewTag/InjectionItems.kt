@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * The type of injection item: code or a set of files.
 */
public external interface InjectionItems {
  /**
   * JavaScript code or CSS to be injected into matching pages.
   */
  public var code: String?

  /**
   * The list of JavaScript or CSS files to be injected into matching pages. These are injected in
   * the order they appear in this array.
   */
  public var files: Array<String>?
}
