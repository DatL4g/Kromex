@file:JsModule("webextension-polyfill")
@file:JsQualifier("proxy")

package browser.proxy

/**
 * Notifies about proxy errors.
 */
public external interface OnProxyErrorListener {
  public var details: DetailsProperty
}
