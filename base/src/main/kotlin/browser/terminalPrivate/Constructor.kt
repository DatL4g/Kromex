@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.terminalPrivate

public inline fun OpenWindowData(block: OpenWindowData.() -> Unit): OpenWindowData = (js("{}") as
    OpenWindowData).apply(block)

public inline fun GetOSInfoReturn(block: GetOSInfoReturn.() -> Unit): GetOSInfoReturn = (js("{}") as
    GetOSInfoReturn).apply(block)

public inline fun OnProcessOutputListener(block: OnProcessOutputListener.() -> Unit):
    OnProcessOutputListener = (js("{}") as OnProcessOutputListener).apply(block)

public inline fun OnPrefChangedListener(block: OnPrefChangedListener.() -> Unit):
    OnPrefChangedListener = (js("{}") as OnPrefChangedListener).apply(block)
