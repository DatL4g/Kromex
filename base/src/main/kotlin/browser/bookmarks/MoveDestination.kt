@file:JsModule("webextension-polyfill")
@file:JsQualifier("bookmarks")

package browser.bookmarks

public external interface MoveDestination {
  public var parentId: String?

  public var index: Int?
}
