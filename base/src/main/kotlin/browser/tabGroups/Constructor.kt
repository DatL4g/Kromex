@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.tabGroups

public inline fun TabGroup(block: TabGroup.() -> Unit): TabGroup = (js("{}") as
    TabGroup).apply(block)

public inline fun QueryQueryInfo(block: QueryQueryInfo.() -> Unit): QueryQueryInfo = (js("{}") as
    QueryQueryInfo).apply(block)

public inline fun UpdateUpdateProperties(block: UpdateUpdateProperties.() -> Unit):
    UpdateUpdateProperties = (js("{}") as UpdateUpdateProperties).apply(block)

public inline fun MoveMoveProperties(block: MoveMoveProperties.() -> Unit): MoveMoveProperties =
    (js("{}") as MoveMoveProperties).apply(block)

public inline fun OnCreatedListener(block: OnCreatedListener.() -> Unit): OnCreatedListener =
    (js("{}") as OnCreatedListener).apply(block)

public inline fun OnUpdatedListener(block: OnUpdatedListener.() -> Unit): OnUpdatedListener =
    (js("{}") as OnUpdatedListener).apply(block)

public inline fun OnMovedListener(block: OnMovedListener.() -> Unit): OnMovedListener = (js("{}") as
    OnMovedListener).apply(block)

public inline fun OnRemovedListener(block: OnRemovedListener.() -> Unit): OnRemovedListener =
    (js("{}") as OnRemovedListener).apply(block)
