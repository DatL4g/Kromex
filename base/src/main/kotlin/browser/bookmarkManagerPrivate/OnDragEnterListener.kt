@file:JsModule("webextension-polyfill")
@file:JsQualifier("bookmarkManagerPrivate")

package browser.bookmarkManagerPrivate

/**
 * Fired when dragging bookmarks over the document.
 */
public external interface OnDragEnterListener {
  public var bookmarkNodeData: BookmarkNodeData
}
