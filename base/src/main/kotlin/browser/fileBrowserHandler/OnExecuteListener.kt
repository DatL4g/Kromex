@file:JsModule("webextension-polyfill")
@file:JsQualifier("fileBrowserHandler")

package browser.fileBrowserHandler

/**
 * Fired when file system action is executed from ChromeOS file browser.
 */
public external interface OnExecuteListener {
  /**
   * File browser action id as specified in the listener component's manifest.
   */
  public var id: String

  /**
   * File handler execute event details.
   */
  public var details: FileHandlerExecuteEventDetails
}
