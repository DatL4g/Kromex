@file:JsModule("webextension-polyfill")
@file:JsQualifier("bookmarks")

package browser.bookmarks

/**
 * Fired when the children of a folder have changed their order due to the order being sorted in the
 * UI.  This is not called as a result of a move().
 */
public external interface OnChildrenReorderedListener {
  public var id: String

  public var reorderInfo: ReorderInfoProperty
}
