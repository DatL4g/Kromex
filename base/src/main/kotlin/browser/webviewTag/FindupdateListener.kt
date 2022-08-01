@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Fired when new find results are available for an active find request. This might happen multiple
 * times for a single find request as matches are found.
 */
public external interface FindupdateListener {
  /**
   * The string that is being searched for in the page.
   */
  public var searchText: String

  /**
   * The number of matches found for <code>searchText</code> on the page so far.
   */
  public var numberOfMatches: Int

  /**
   * The ordinal number of the current active match, if it has been found. This will be
   * <code>0</code> until then.
   */
  public var activeMatchOrdinal: Int

  /**
   * Describes a rectangle around the active match, if it has been found, in screen coordinates.
   */
  public var selectionRect: SelectionRect

  /**
   * Indicates whether the find request was canceled.
   */
  public var canceled: Boolean

  /**
   * Indicates that all find requests have completed and that no more <code>findupdate</code> events
   * will be fired until more find requests are made.
   */
  public var finalUpdate: String
}
