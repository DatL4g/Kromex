@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

/**
 * Fired just before a request is going to be sent to the server (modifications of previous
 * onBeforeSendHeaders callbacks are visible by the time onSendHeaders is fired).
 */
public external interface OnSendHeadersListener {
  public var details: DetailsProperty
}
