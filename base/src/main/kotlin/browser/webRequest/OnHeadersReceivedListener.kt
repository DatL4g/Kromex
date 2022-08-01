@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

/**
 * Fired when HTTP response headers of a request have been received.
 */
public external interface OnHeadersReceivedListener {
  public var details: DetailsProperty
}
