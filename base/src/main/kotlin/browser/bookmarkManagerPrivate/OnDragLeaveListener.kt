@file:JsModule("webextension-polyfill")
@file:JsQualifier("bookmarkManagerPrivate")

package browser.bookmarkManagerPrivate

/**
 * Fired when the drag and drop leaves the document.
 */
public external interface OnDragLeaveListener {
  public var bookmarkNodeData: BookmarkNodeData
}
