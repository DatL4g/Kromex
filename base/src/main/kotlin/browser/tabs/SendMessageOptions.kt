@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

public external interface SendMessageOptions {
  /**
   * Send a message to a specific <a href='webNavigation#frame_ids'>frame</a> identified by
   * <code>frameId</code> instead of all frames in the tab.
   */
  public var frameId: Int?

  /**
   * Send a message to a specific <a href='webNavigation#document_ids'>document</a> identified by
   * <code>documentId</code> instead of all frames in the tab.
   */
  public var documentId: String?
}
