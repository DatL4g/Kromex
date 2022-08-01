@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.debugger

public inline fun Debuggee(block: Debuggee.() -> Unit): Debuggee = (js("{}") as
    Debuggee).apply(block)

public inline fun TargetInfo(block: TargetInfo.() -> Unit): TargetInfo = (js("{}") as
    TargetInfo).apply(block)

public inline fun OnEventListener(block: OnEventListener.() -> Unit): OnEventListener = (js("{}") as
    OnEventListener).apply(block)

public inline fun OnDetachListener(block: OnDetachListener.() -> Unit): OnDetachListener = (js("{}")
    as OnDetachListener).apply(block)
