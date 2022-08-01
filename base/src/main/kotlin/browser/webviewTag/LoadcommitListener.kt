@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Fired when a load has committed. This includes navigation within the current document as well as
 * subframe document-level loads, but does <em>not</em> include asynchronous resource loads.
 */
public external interface LoadcommitListener {
  /**
   * The URL that committed.
   */
  public var url: String

  /**
   * Whether the load is top-level or in a subframe.
   */
  public var isTopLevel: Boolean
}
