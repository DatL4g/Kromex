@file:JsModule("webextension-polyfill")
@file:JsQualifier("webNavigation")

package browser.webNavigation

/**
 * Information about the requested frame, null if the specified frame ID and/or tab ID are invalid.
 */
public external interface GetFrameReturn {
  /**
   * True if the last navigation in this frame was interrupted by an error, i.e. the onErrorOccurred
   * event fired.
   */
  public var errorOccurred: Boolean

  /**
   * The URL currently associated with this frame, if the frame identified by the frameId existed at
   * one point in the given tab. The fact that an URL is associated with a given frameId does not imply
   * that the corresponding frame still exists.
   */
  public var url: String

  /**
   * The ID of the parent frame, or <code>-1</code> if this is the main frame.
   */
  public var parentFrameId: Int

  /**
   * A UUID of the document loaded.
   */
  public var documentId: String

  /**
   * A UUID of the parent document owning this frame. This is not set if there is no parent.
   */
  public var parentDocumentId: String?

  /**
   * The lifecycle the document is in.
   */
  public var documentLifecycle: String

  /**
   * The type of frame the navigation occurred in.
   */
  public var frameType: String
}
