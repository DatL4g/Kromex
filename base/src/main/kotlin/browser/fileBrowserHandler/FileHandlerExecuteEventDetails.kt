@file:JsModule("webextension-polyfill")
@file:JsQualifier("fileBrowserHandler")

package browser.fileBrowserHandler

/**
 * Event details payload for fileBrowserHandler.onExecute event.
 */
public external interface FileHandlerExecuteEventDetails {
  /**
   * Array of Entry instances representing files that are targets of this action (selected in
   * ChromeOS file browser).
   */
  public var entries: Array<Any>

  /**
   * The ID of the tab that raised this event. Tab IDs are unique within a browser session.
   */
  public var tab_id: Int?
}
