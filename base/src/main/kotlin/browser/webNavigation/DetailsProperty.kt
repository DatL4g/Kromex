@file:JsModule("webextension-polyfill")
@file:JsQualifier("webNavigation")

package browser.webNavigation

public external interface DetailsProperty {
  /**
   * The ID of the tab in which the navigation occurs.
   */
  public var tabId: Int

  public var url: String

  /**
   * The ID of the process that runs the renderer for this frame.
   */
  public var processId: Int

  /**
   * 0 indicates the navigation happens in the tab content window; a positive value indicates
   * navigation in a subframe. Frame IDs are unique within a tab.
   */
  public var frameId: Int

  /**
   * The ID of the parent frame, or <code>-1</code> if this is the main frame.
   */
  public var parentFrameId: Int

  /**
   * Cause of the navigation.
   */
  public var transitionType: TransitionType

  /**
   * A list of transition qualifiers.
   */
  public var transitionQualifiers: Array<TransitionQualifier>

  /**
   * The time when the navigation was committed, in milliseconds since the epoch.
   */
  public var timeStamp: Number

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
