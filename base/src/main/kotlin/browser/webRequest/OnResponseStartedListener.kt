@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

/**
 * Fired when the first byte of the response body is received. For HTTP requests, this means that
 * the status line and response headers are available.
 */
public external interface OnResponseStartedListener {
  public var details: DetailsProperty
}
