@file:JsModule("webextension-polyfill")
@file:JsQualifier("bookmarks")

package browser.bookmarks

public external interface RemoveInfoProperty {
  public var parentId: String

  public var index: Int

  public var node: BookmarkTreeNode
}
