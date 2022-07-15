@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

/**
 * Returns value for event handlers that have the 'blocking' extraInfoSpec applied.
 * Allows the event handler to modify network requests.
 */
external interface BlockingResponse {
    /**
     * If true, the request is cancelled.
     * This prevents the request from being sent.
     * This can be used as a response to the onBeforeRequest, onBeforeSendHeaders, onHeadersReceived and onAuthRequired events.
     */
    var cancel: Boolean?

    /**
     * Only used as a response to the onBeforeRequest and onHeadersReceived events.
     * If set, the original request is prevented from being sent/completed and is instead redirected to the given URL.
     * Redirections to non-HTTP schemes such as data: are allowed.
     * Redirects initiated by a redirect action use the original request method for the redirect, with one exception:
     * If the redirect is initiated at the onHeadersReceived stage, then the redirect will be issued using the GET method.
     * Redirects from URLs with ws:// and wss:// schemes are ignored.
     */
    var redirectUrl: String?

    /**
     * Only used as a response to the onBeforeSendHeaders event.
     * If set, the request is made with these request headers instead.
     */
    var requestHeaders: HttpHeaders?

    /**
     * Only used as a response to the onHeadersReceived event.
     * If set, the server is assumed to have responded with these response headers instead.
     * Only return responseHeaders if you really want to modify the headers in order to limit the number of conflicts (only one extension may modify responseHeaders for each request).
     */
    var responseHeaders: HttpHeaders?

    /**
     * Only used as a response to the onAuthRequired event.
     * If set, the request is made using the supplied credentials.
     */
    var authCredentials: AuthCredentials?
}