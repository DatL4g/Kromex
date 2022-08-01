@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.extension

public inline fun GetViewsFetchProperties(block: GetViewsFetchProperties.() -> Unit):
    GetViewsFetchProperties = (js("{}") as GetViewsFetchProperties).apply(block)

public inline fun OnRequestListener(block: OnRequestListener.() -> Unit): OnRequestListener =
    (js("{}") as OnRequestListener).apply(block)

public inline fun OnRequestExternalListener(block: OnRequestExternalListener.() -> Unit):
    OnRequestExternalListener = (js("{}") as OnRequestExternalListener).apply(block)
