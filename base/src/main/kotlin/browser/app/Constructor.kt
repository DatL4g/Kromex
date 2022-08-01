@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.app

public inline fun Details(block: Details.() -> Unit): Details = (js("{}") as Details).apply(block)

public inline fun DOMWindow(block: DOMWindow.() -> Unit): DOMWindow = (js("{}") as
    DOMWindow).apply(block)
