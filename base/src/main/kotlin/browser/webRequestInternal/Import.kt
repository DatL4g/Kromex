@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequestInternal")

package browser.webRequestInternal

import browser.webRequest.BlockingResponse
import browser.webRequest.RequestFilter
import kotlin.js.Promise

/**
 * Used internally to implement the special form of addListener for the webRequest events.
 *
 * @param filter A set of filters that restricts the events that will be sent to this listener.
 * @param extraInfoSpec Array of extra information that should be passed to the listener function.
 */
public external fun addEventListener(
  filter: RequestFilter,
  extraInfoSpec: Array<AddEventListenerOptions> = definedExternally,
  eventName: String,
  subEventName: String,
  webViewInstanceId: Int,
): Promise<Nothing>

/**
 * Used internally to send a response for a blocked event.
 */
public external fun eventHandled(
  eventName: String,
  subEventName: String,
  requestId: String,
  webViewInstanceId: Int,
  response: BlockingResponse? = definedExternally,
): Nothing
