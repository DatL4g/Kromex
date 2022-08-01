@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

/**
 * Fired when a request is about to occur.
 */
public external interface OnBeforeRequestListener {
  public var details: DetailsProperty
}
