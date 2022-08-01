@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.sessions

public inline fun Filter(block: Filter.() -> Unit): Filter = (js("{}") as Filter).apply(block)

public inline fun Session(block: Session.() -> Unit): Session = (js("{}") as Session).apply(block)

public inline fun Device(block: Device.() -> Unit): Device = (js("{}") as Device).apply(block)
