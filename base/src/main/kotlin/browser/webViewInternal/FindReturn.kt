@file:JsModule("webextension-polyfill")
@file:JsQualifier("webViewInternal")

package browser.webViewInternal

public external interface FindReturn {
  /**
   * The number of times |searchText| was matched on the page.
   */
  public var numberOfMatches: Int

  /**
   * The ordinal number of the current match.
   */
  public var activeMatchOrdinal: Int

  /**
   * Describes a rectangle around the active match.
   */
  public var selectionRect: SelectionRectProperty

  /**
   * Indicates whether this find request was canceled.
   */
  public var canceled: Boolean
}
