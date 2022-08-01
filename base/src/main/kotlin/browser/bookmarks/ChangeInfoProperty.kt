@file:JsModule("webextension-polyfill")
@file:JsQualifier("bookmarks")

package browser.bookmarks

public external interface ChangeInfoProperty {
  public var title: String

  public var url: String?
}
