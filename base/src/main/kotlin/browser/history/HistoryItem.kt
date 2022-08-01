@file:JsModule("webextension-polyfill")
@file:JsQualifier("history")

package browser.history

/**
 * An object encapsulating one result of a history query.
 */
public external interface HistoryItem {
  /**
   * The unique identifier for the item.
   */
  public var id: String

  /**
   * The URL navigated to by a user.
   */
  public var url: String?

  /**
   * The title of the page when it was last loaded.
   */
  public var title: String?

  /**
   * When this page was last loaded, represented in milliseconds since the epoch.
   */
  public var lastVisitTime: Number?

  /**
   * The number of times the user has navigated to this page.
   */
  public var visitCount: Int?

  /**
   * The number of times the user has navigated to this page by typing in the address.
   */
  public var typedCount: Int?
}
