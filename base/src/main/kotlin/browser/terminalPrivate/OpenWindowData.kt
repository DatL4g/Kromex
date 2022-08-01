@file:JsModule("webextension-polyfill")
@file:JsQualifier("terminalPrivate")

package browser.terminalPrivate

public external interface OpenWindowData {
  /**
   * The url for the new Terminal window.
   */
  public var url: String?

  /**
   * Instead of openning a new window, open it as a new tab in the current app window.
   */
  public var asTab: Boolean?
}
