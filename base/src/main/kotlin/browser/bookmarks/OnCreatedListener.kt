@file:JsModule("webextension-polyfill")
@file:JsQualifier("bookmarks")

package browser.bookmarks

/**
 * Fired when a bookmark or folder is created.
 */
public external interface OnCreatedListener {
  public var id: String

  public var bookmark: BookmarkTreeNode
}
