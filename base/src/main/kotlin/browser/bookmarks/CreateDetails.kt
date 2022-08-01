@file:JsModule("webextension-polyfill")
@file:JsQualifier("bookmarks")

package browser.bookmarks

/**
 * Object passed to the create() function.
 */
public external interface CreateDetails {
  /**
   * Defaults to the Other Bookmarks folder.
   */
  public var parentId: String?

  public var index: Int?

  public var title: String?

  public var url: String?
}
