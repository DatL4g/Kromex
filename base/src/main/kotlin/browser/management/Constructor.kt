@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.management

public inline fun IconInfo(block: IconInfo.() -> Unit): IconInfo = (js("{}") as
    IconInfo).apply(block)

public inline fun ExtensionInfo(block: ExtensionInfo.() -> Unit): ExtensionInfo = (js("{}") as
    ExtensionInfo).apply(block)

public inline fun UninstallOptions(block: UninstallOptions.() -> Unit): UninstallOptions = (js("{}")
    as UninstallOptions).apply(block)

public inline fun OnInstalledListener(block: OnInstalledListener.() -> Unit): OnInstalledListener =
    (js("{}") as OnInstalledListener).apply(block)

public inline fun OnUninstalledListener(block: OnUninstalledListener.() -> Unit):
    OnUninstalledListener = (js("{}") as OnUninstalledListener).apply(block)

public inline fun OnEnabledListener(block: OnEnabledListener.() -> Unit): OnEnabledListener =
    (js("{}") as OnEnabledListener).apply(block)

public inline fun OnDisabledListener(block: OnDisabledListener.() -> Unit): OnDisabledListener =
    (js("{}") as OnDisabledListener).apply(block)
