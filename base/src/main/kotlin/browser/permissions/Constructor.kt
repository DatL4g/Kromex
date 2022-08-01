@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.permissions

public inline fun Permissions(block: Permissions.() -> Unit): Permissions = (js("{}") as
    Permissions).apply(block)

public inline fun OnAddedListener(block: OnAddedListener.() -> Unit): OnAddedListener = (js("{}") as
    OnAddedListener).apply(block)

public inline fun OnRemovedListener(block: OnRemovedListener.() -> Unit): OnRemovedListener =
    (js("{}") as OnRemovedListener).apply(block)
