@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Fired when a top-level load has aborted without committing. An error message will be printed to
 * the console unless the event is default-prevented. <p class="note"><strong>Note:</strong> When a
 * resource load is aborted, a <code>loadabort</code> event will eventually be followed by a
 * <code>loadstop</code> event, even if all committed loads since the last <code>loadstop</code> event
 * (if any) were aborted.</p><p class="note"><strong>Note:</strong> When the load of either an about
 * URL or a JavaScript URL is aborted, <code>loadabort</code> will be fired and then the
 * <code>webview</code> will be navigated to 'about:blank'.</p>
 */
public external interface LoadabortListener {
  /**
   * Requested URL.
   */
  public var url: String

  /**
   * Whether the load was top-level or in a subframe.
   */
  public var isTopLevel: Boolean

  /**
   * Unique integer ID for the type of abort. Note that this ID is <em>not</em> guaranteed to remain
   * backwards compatible between releases. You must not act based upon this specific integer.
   */
  public var code: Int

  /**
   * String indicating what type of abort occurred. This string is <em>not</em> guaranteed to remain
   * backwards compatible between releases. You must not parse and act based upon its content. It is
   * also possible that, in some cases, an error not listed here could be reported.
   */
  public var reason: String
}
