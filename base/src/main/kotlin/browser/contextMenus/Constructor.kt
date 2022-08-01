@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.contextMenus

public inline fun OnClickData(block: OnClickData.() -> Unit): OnClickData = (js("{}") as
    OnClickData).apply(block)

public inline fun CreateCreateProperties(block: CreateCreateProperties.() -> Unit):
    CreateCreateProperties = (js("{}") as CreateCreateProperties).apply(block)

public inline fun UpdateUpdateProperties(block: UpdateUpdateProperties.() -> Unit):
    UpdateUpdateProperties = (js("{}") as UpdateUpdateProperties).apply(block)

public inline fun OnClickedListener(block: OnClickedListener.() -> Unit): OnClickedListener =
    (js("{}") as OnClickedListener).apply(block)
