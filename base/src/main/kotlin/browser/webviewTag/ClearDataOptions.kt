@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Options that determine what data should be cleared by <code>clearData</code>.
 */
public external interface ClearDataOptions {
  /**
   * Clear data accumulated on or after this date, represented in milliseconds since the epoch
   * (accessible via the getTime method of the JavaScript <code>Date</code> object). If absent,
   * defaults to <code>0</code> (which would remove all browsing data).
   */
  public var since: Number?
}
