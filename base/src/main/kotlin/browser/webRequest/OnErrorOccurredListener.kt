@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

/**
 * Fired when an error occurs.
 */
public external interface OnErrorOccurredListener {
  public var details: DetailsProperty
}
