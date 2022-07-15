@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

import browser.events.Event
import browser.webRequest.details.BeforeRequestDetails
import browser.webRequest.details.BeforeSendHeadersDetails
import browser.webRequest.details.HeadersReceivedDetails
import browser.webRequest.details.SendHeadersDetails
import kotlin.js.Promise

/**
 * The maximum number of times that handlerBehaviorChanged can be called per 10 minute sustained interval.
 * handlerBehaviorChanged is an expensive function call that shouldn't be called often.
 */
external val MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES: Number = definedExternally

/**
 * Needs to be called when the behavior of the webRequest handlers has changed to prevent incorrect handling due to caching.
 * This function call is expensive.
 * Don't call it often.
 */
external fun handlerBehaviorChanged(): Promise<Nothing?>?

/**
 * Fired when a request is about to occur.
 */
external val onBeforeRequest: Event<BeforeRequestDetails?, BlockingResponse?> = definedExternally

/**
 * Fired before sending an HTTP request, once the request headers are available.
 * This may occur after a TCP connection is made to the server, but before any HTTP data is sent.
 */
external val onBeforeSendHeaders: Event<BeforeSendHeadersDetails?, BlockingResponse?> = definedExternally

/**
 * Fired just before a request is going to be sent to the server (modifications of previous onBeforeSendHeaders callbacks are visible by the time onSendHeaders is fired).
 */
external val onSendHeaders: Event<SendHeadersDetails?, Unit> = definedExternally

/**
 * Fired when HTTP response headers of a request have been received.
 */
external val onHeadersReceived: Event<HeadersReceivedDetails?, BlockingResponse?> = definedExternally