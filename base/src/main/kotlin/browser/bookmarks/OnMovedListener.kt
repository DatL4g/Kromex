@file:JsModule("webextension-polyfill")
@file:JsQualifier("bookmarks")

package browser.bookmarks

/**
 * Fired when a bookmark or folder is moved to a different parent folder.
 */
public external interface OnMovedListener {
  public var id: String

  public var moveInfo: MoveInfoProperty
}
