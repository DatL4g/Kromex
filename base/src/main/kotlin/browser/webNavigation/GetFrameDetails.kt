@file:JsModule("webextension-polyfill")
@file:JsQualifier("webNavigation")

package browser.webNavigation

/**
 * Information about the frame to retrieve information about.
 */
public external interface GetFrameDetails {
  /**
   * The ID of the tab in which the frame is.
   */
  public var tabId: Int?

  /**
   * The ID of the process that runs the renderer for this tab.
   */
  @Deprecated(
    message =
        "Frames are now uniquely identified by their tab ID and frame ID; the process ID is no longer needed and therefore ignored.",
    level = DeprecationLevel.WARNING,
  )
  public var processId: Int?

  /**
   * The ID of the frame in the given tab.
   */
  public var frameId: Int?

  /**
   * The UUID of the document. If the frameId and/or tabId are provided they will be validated to
   * match the document found by provided document ID.
   */
  public var documentId: String?
}
