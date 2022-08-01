@file:JsModule("webextension-polyfill")
@file:JsQualifier("bookmarks")

package browser.bookmarks

/**
 * Fired when a bookmark or folder is removed.  When a folder is removed recursively, a single
 * notification is fired for the folder, and none for its contents.
 */
public external interface OnRemovedListener {
  public var id: String

  public var removeInfo: RemoveInfoProperty
}
