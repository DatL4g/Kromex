@file:JsModule("webextension-polyfill")
@file:JsQualifier("bookmarks")

package browser.bookmarks

public external interface MoveInfoProperty {
  public var parentId: String

  public var index: Int

  public var oldParentId: String

  public var oldIndex: Int
}
