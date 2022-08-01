@file:JsModule("webextension-polyfill")
@file:JsQualifier("bookmarkManagerPrivate")

package browser.bookmarkManagerPrivate

/**
 * Information about the drag and drop data for use with drag and drop events.
 */
public external interface BookmarkNodeData {
  public var sameProfile: Boolean

  public var elements: Array<BookmarkNodeDataElement>
}
