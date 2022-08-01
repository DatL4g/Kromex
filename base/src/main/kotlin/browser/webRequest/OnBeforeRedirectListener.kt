@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

/**
 * Fired when a server-initiated redirect is about to occur.
 */
public external interface OnBeforeRedirectListener {
  public var details: DetailsProperty
}
