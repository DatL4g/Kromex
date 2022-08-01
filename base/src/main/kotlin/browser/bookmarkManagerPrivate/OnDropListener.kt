@file:JsModule("webextension-polyfill")
@file:JsQualifier("bookmarkManagerPrivate")

package browser.bookmarkManagerPrivate

/**
 * Fired when the user drops bookmarks on the document.
 */
public external interface OnDropListener {
  public var bookmarkNodeData: BookmarkNodeData
}
