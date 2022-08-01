@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Fired when a top-level load request has redirected to a different URL.
 */
public external interface LoadredirectListener {
  /**
   * The requested URL before the redirect.
   */
  public var oldUrl: String

  /**
   * The new URL after the redirect.
   */
  public var newUrl: String

  /**
   * Whether or not the redirect happened at top-level or in a subframe.
   */
  public var isTopLevel: Boolean
}
