@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

/**
 * Fired when an authentication failure is received. The listener has three options: it can provide
 * authentication credentials, it can cancel the request and display the error page, or it can take no
 * action on the challenge. If bad user credentials are provided, this may be called multiple times for
 * the same request. Note, only one of <code>'blocking'</code> or <code>'asyncBlocking'</code> modes
 * must be specified in the <code>extraInfoSpec</code> parameter.
 */
public external interface OnAuthRequiredListener {
  public var details: DetailsProperty

  /**
   * Only valid if <code>'asyncBlocking'</code> is specified as one of the
   * <code>OnAuthRequiredOptions</code>.
   */
  public fun asyncCallback(response: BlockingResponse): Nothing
}
