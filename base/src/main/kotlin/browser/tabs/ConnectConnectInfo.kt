@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

public external interface ConnectConnectInfo {
  /**
   * Is passed into onConnect for content scripts that are listening for the connection event.
   */
  public var name: String?

  /**
   * Open a port to a specific <a href='webNavigation#frame_ids'>frame</a> identified by
   * <code>frameId</code> instead of all frames in the tab.
   */
  public var frameId: Int?

  /**
   * Open a port to a specific <a href='webNavigation#document_ids'>document</a> identified by
   * <code>documentId</code> instead of all frames in the tab.
   */
  public var documentId: String?
}
