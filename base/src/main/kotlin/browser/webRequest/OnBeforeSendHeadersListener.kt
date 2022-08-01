@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

/**
 * Fired before sending an HTTP request, once the request headers are available. This may occur
 * after a TCP connection is made to the server, but before any HTTP data is sent. 
 */
public external interface OnBeforeSendHeadersListener {
  public var details: DetailsProperty
}
