@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

import browser.events.Event
import kotlin.js.Promise

/**
 * The maximum number of times that <code>handlerBehaviorChanged</code> can be called per 10 minute
 * sustained interval. <code>handlerBehaviorChanged</code> is an expensive function call that shouldn't
 * be called often.
 */
public external val MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES: Number = definedExternally

/**
 * Needs to be called when the behavior of the webRequest handlers has changed to prevent incorrect
 * handling due to caching. This function call is expensive. Don't call it often.
 */
public external fun handlerBehaviorChanged(): Promise<Nothing>

/**
 * Fired when a request is about to occur.
 */
public external val onBeforeRequest: Event<OnBeforeRequestListener, BlockingResponse?> =
    definedExternally

/**
 * Fired before sending an HTTP request, once the request headers are available. This may occur
 * after a TCP connection is made to the server, but before any HTTP data is sent. 
 */
public external val onBeforeSendHeaders: Event<OnBeforeSendHeadersListener, BlockingResponse?> =
    definedExternally

/**
 * Fired just before a request is going to be sent to the server (modifications of previous
 * onBeforeSendHeaders callbacks are visible by the time onSendHeaders is fired).
 */
public external val onSendHeaders: Event<OnSendHeadersListener, Unit> = definedExternally

/**
 * Fired when HTTP response headers of a request have been received.
 */
public external val onHeadersReceived: Event<OnHeadersReceivedListener, BlockingResponse?> =
    definedExternally

/**
 * Fired when an authentication failure is received. The listener has three options: it can provide
 * authentication credentials, it can cancel the request and display the error page, or it can take no
 * action on the challenge. If bad user credentials are provided, this may be called multiple times for
 * the same request. Note, only one of <code>'blocking'</code> or <code>'asyncBlocking'</code> modes
 * must be specified in the <code>extraInfoSpec</code> parameter.
 */
public external val onAuthRequired: Event<OnAuthRequiredListener, Promise<BlockingResponse?>?> =
    definedExternally

/**
 * Fired when the first byte of the response body is received. For HTTP requests, this means that
 * the status line and response headers are available.
 */
public external val onResponseStarted: Event<OnResponseStartedListener, Unit> = definedExternally

/**
 * Fired when a server-initiated redirect is about to occur.
 */
public external val onBeforeRedirect: Event<OnBeforeRedirectListener, Unit> = definedExternally

/**
 * Fired when a request is completed.
 */
public external val onCompleted: Event<OnCompletedListener, Unit> = definedExternally

/**
 * Fired when an error occurs.
 */
public external val onErrorOccurred: Event<OnErrorOccurredListener, Unit> = definedExternally

/**
 * Fired when an extension's proposed modification to a network request is ignored. This happens in
 * case of conflicts with other extensions.
 */
public external val onActionIgnored: Event<OnActionIgnoredListener, Unit> = definedExternally
