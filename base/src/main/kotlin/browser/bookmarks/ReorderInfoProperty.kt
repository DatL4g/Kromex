@file:JsModule("webextension-polyfill")
@file:JsQualifier("bookmarks")

package browser.bookmarks

public external interface ReorderInfoProperty {
  public var childIds: Array<String>
}
