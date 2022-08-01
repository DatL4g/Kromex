@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Contains all of the results of the find request.
 */
public external interface FindCallbackResults {
  /**
   * The number of times <code>searchText</code> was matched on the page.
   */
  public var numberOfMatches: Int

  /**
   * The ordinal number of the current match.
   */
  public var activeMatchOrdinal: Int

  /**
   * Describes a rectangle around the active match in screen coordinates.
   */
  public var selectionRect: SelectionRect

  /**
   * Indicates whether this find request was canceled.
   */
  public var canceled: Boolean
}
