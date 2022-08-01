@file:JsModule("webextension-polyfill")
@file:JsQualifier("history")

package browser.history

public external interface SearchQuery {
  /**
   * A free-text query to the history service.  Leave empty to retrieve all pages.
   */
  public var text: String

  /**
   * Limit results to those visited after this date, represented in milliseconds since the epoch. If
   * not specified, this defaults to 24 hours in the past.
   */
  public var startTime: Number?

  /**
   * Limit results to those visited before this date, represented in milliseconds since the epoch.
   */
  public var endTime: Number?

  /**
   * The maximum number of results to retrieve.  Defaults to 100.
   */
  public var maxResults: Int?
}
