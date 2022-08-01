@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.test

public inline fun GetConfigReturn(block: GetConfigReturn.() -> Unit): GetConfigReturn = (js("{}") as
    GetConfigReturn).apply(block)

public inline fun SetExceptionHandlerReturn(block: SetExceptionHandlerReturn.() -> Unit):
    SetExceptionHandlerReturn = (js("{}") as SetExceptionHandlerReturn).apply(block)

public inline fun OnMessageListener(block: OnMessageListener.() -> Unit): OnMessageListener =
    (js("{}") as OnMessageListener).apply(block)
