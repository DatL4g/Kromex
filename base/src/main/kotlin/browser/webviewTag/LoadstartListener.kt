@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Fired when a load has begun.
 */
public external interface LoadstartListener {
  /**
   * Requested URL.
   */
  public var url: String

  /**
   * Whether the load is top-level or in a subframe.
   */
  public var isTopLevel: Boolean
}
