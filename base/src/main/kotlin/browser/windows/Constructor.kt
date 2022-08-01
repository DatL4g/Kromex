@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.windows

public inline fun Window(block: Window.() -> Unit): Window = (js("{}") as Window).apply(block)

public inline fun QueryOptions(block: QueryOptions.() -> Unit): QueryOptions = (js("{}") as
    QueryOptions).apply(block)

public inline fun CreateCreateData(block: CreateCreateData.() -> Unit): CreateCreateData = (js("{}")
    as CreateCreateData).apply(block)

public inline fun UpdateUpdateInfo(block: UpdateUpdateInfo.() -> Unit): UpdateUpdateInfo = (js("{}")
    as UpdateUpdateInfo).apply(block)

public inline fun OnCreatedListener(block: OnCreatedListener.() -> Unit): OnCreatedListener =
    (js("{}") as OnCreatedListener).apply(block)

public inline fun OnRemovedListener(block: OnRemovedListener.() -> Unit): OnRemovedListener =
    (js("{}") as OnRemovedListener).apply(block)

public inline fun OnFocusChangedListener(block: OnFocusChangedListener.() -> Unit):
    OnFocusChangedListener = (js("{}") as OnFocusChangedListener).apply(block)

public inline fun OnBoundsChangedListener(block: OnBoundsChangedListener.() -> Unit):
    OnBoundsChangedListener = (js("{}") as OnBoundsChangedListener).apply(block)
