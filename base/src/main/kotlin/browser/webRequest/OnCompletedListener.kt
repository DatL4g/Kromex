@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

/**
 * Fired when a request is completed.
 */
public external interface OnCompletedListener {
  public var details: DetailsProperty
}
