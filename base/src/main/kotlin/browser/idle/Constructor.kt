@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.idle

public inline fun OnStateChangedListener(block: OnStateChangedListener.() -> Unit):
    OnStateChangedListener = (js("{}") as OnStateChangedListener).apply(block)
