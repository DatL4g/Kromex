@file:JsModule("webextension-polyfill")
@file:JsQualifier("bookmarks")

package browser.bookmarks

public external interface UpdateChanges {
  public var title: String?

  public var url: String?
}
