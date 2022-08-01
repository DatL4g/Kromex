@file:JsModule("webextension-polyfill")
@file:JsQualifier("webViewInternal")

package browser.webViewInternal

/**
 * Options that determine exactly what data will be removed.
 */
public external interface RemovalOptions {
  /**
   * Remove data accumulated on or after this date, represented in milliseconds since the epoch
   * (accessible via the <code>getTime</code> method of the JavaScript <code>Date</code> object). If
   * absent, defaults to 0 (which would remove all browsing data).
   */
  public var since: Number?
}
