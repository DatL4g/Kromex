@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Fired when the page's zoom changes.
 */
public external interface ZoomchangeListener {
  /**
   * The page's previous zoom factor.
   */
  public var oldZoomFactor: Number

  /**
   * The new zoom factor that the page was zoomed to.
   */
  public var newZoomFactor: Number
}
