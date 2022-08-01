@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.gcm

public inline fun SendMessage(block: SendMessage.() -> Unit): SendMessage = (js("{}") as
    SendMessage).apply(block)

public inline fun OnMessageListener(block: OnMessageListener.() -> Unit): OnMessageListener =
    (js("{}") as OnMessageListener).apply(block)

public inline fun OnSendErrorListener(block: OnSendErrorListener.() -> Unit): OnSendErrorListener =
    (js("{}") as OnSendErrorListener).apply(block)
