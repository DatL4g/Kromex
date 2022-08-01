@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.webRequest

public inline fun RequestFilter(block: RequestFilter.() -> Unit): RequestFilter = (js("{}") as
    RequestFilter).apply(block)

public inline fun HttpHeadersAliasProperty(block: HttpHeadersAliasProperty.() -> Unit):
    HttpHeadersAliasProperty = (js("{}") as HttpHeadersAliasProperty).apply(block)

/**
 * An array of HTTP headers. Each header is represented as a dictionary containing the keys
 * <code>name</code> and either <code>value</code> or <code>binaryValue</code>.
 */
public typealias HttpHeaders = Array<HttpHeadersAliasProperty>

public inline fun BlockingResponse(block: BlockingResponse.() -> Unit): BlockingResponse = (js("{}")
    as BlockingResponse).apply(block)

public inline fun UploadData(block: UploadData.() -> Unit): UploadData = (js("{}") as
    UploadData).apply(block)

public inline fun FormDataItem(block: FormDataItem.() -> Unit): FormDataItem = (js("{}") as
    FormDataItem).apply(block)

public inline fun OnBeforeRequestListener(block: OnBeforeRequestListener.() -> Unit):
    OnBeforeRequestListener = (js("{}") as OnBeforeRequestListener).apply(block)

public inline fun OnBeforeSendHeadersListener(block: OnBeforeSendHeadersListener.() -> Unit):
    OnBeforeSendHeadersListener = (js("{}") as OnBeforeSendHeadersListener).apply(block)

public inline fun OnSendHeadersListener(block: OnSendHeadersListener.() -> Unit):
    OnSendHeadersListener = (js("{}") as OnSendHeadersListener).apply(block)

public inline fun OnHeadersReceivedListener(block: OnHeadersReceivedListener.() -> Unit):
    OnHeadersReceivedListener = (js("{}") as OnHeadersReceivedListener).apply(block)

public inline fun OnAuthRequiredListener(block: OnAuthRequiredListener.() -> Unit):
    OnAuthRequiredListener = (js("{}") as OnAuthRequiredListener).apply(block)

public inline fun OnResponseStartedListener(block: OnResponseStartedListener.() -> Unit):
    OnResponseStartedListener = (js("{}") as OnResponseStartedListener).apply(block)

public inline fun OnBeforeRedirectListener(block: OnBeforeRedirectListener.() -> Unit):
    OnBeforeRedirectListener = (js("{}") as OnBeforeRedirectListener).apply(block)

public inline fun OnCompletedListener(block: OnCompletedListener.() -> Unit): OnCompletedListener =
    (js("{}") as OnCompletedListener).apply(block)

public inline fun OnErrorOccurredListener(block: OnErrorOccurredListener.() -> Unit):
    OnErrorOccurredListener = (js("{}") as OnErrorOccurredListener).apply(block)

public inline fun OnActionIgnoredListener(block: OnActionIgnoredListener.() -> Unit):
    OnActionIgnoredListener = (js("{}") as OnActionIgnoredListener).apply(block)
