@file:JsModule("webextension-polyfill")
@file:JsQualifier("sessions")

package browser.sessions

public external interface Filter {
  /**
   * The maximum number of entries to be fetched in the requested list. Omit this parameter to fetch
   * the maximum number of entries ($(ref:sessions.MAX_SESSION_RESULTS)).
   */
  public var maxResults: Int?
}
