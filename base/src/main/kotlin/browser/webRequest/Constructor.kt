@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.webRequest

import browser.webRequest.details.BeforeRequestDetails
import browser.webRequest.details.BeforeSendHeadersDetails
import browser.webRequest.details.HeadersReceivedDetails
import browser.webRequest.details.SendHeadersDetails

inline fun BeforeRequestDetails(block: BeforeRequestDetails.() -> Unit) = (js("{}") as BeforeRequestDetails).apply(block)
inline fun BeforeSendHeadersDetails(block: BeforeSendHeadersDetails.() -> Unit) = (js("{}") as BeforeSendHeadersDetails).apply(block)
inline fun SendHeadersDetails(block: SendHeadersDetails.() -> Unit) = (js("{}") as SendHeadersDetails).apply(block)
inline fun HeadersReceivedDetails(block: HeadersReceivedDetails.() -> Unit) = (js("{}") as HeadersReceivedDetails).apply(block)

typealias HttpHeaders = Array<HttpHeader>