@file:JsModule("webextension-polyfill")
@file:JsQualifier("bookmarks")

package browser.bookmarks

/**
 * Fired when a bookmark or folder changes.  <b>Note:</b> Currently, only title and url changes
 * trigger this.
 */
public external interface OnChangedListener {
  public var id: String

  public var changeInfo: ChangeInfoProperty
}
