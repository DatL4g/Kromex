@file:JsModule("webextension-polyfill")
@file:JsQualifier("bookmarkManagerPrivate")

package browser.bookmarkManagerPrivate

public external interface BookmarkNodeDataElement {
  /**
   * The ID of the bookmark. This is only provided if the data is from the same profile.
   */
  public var id: String?

  /**
   * The ID of the parent of the bookmark. This is only provided if the data is from the same
   * profile.
   */
  public var parentId: String?

  public var title: String

  public var url: String?

  public var children: Array<BookmarkNodeDataElement>
}
