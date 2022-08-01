@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.activityLogPrivate

public inline fun ExtensionActivity(block: ExtensionActivity.() -> Unit): ExtensionActivity =
    (js("{}") as ExtensionActivity).apply(block)

public inline fun Filter(block: Filter.() -> Unit): Filter = (js("{}") as Filter).apply(block)

public inline fun ActivityResultSet(block: ActivityResultSet.() -> Unit): ActivityResultSet =
    (js("{}") as ActivityResultSet).apply(block)

public inline fun OnExtensionActivityListener(block: OnExtensionActivityListener.() -> Unit):
    OnExtensionActivityListener = (js("{}") as OnExtensionActivityListener).apply(block)
