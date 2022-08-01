@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.types

public inline fun GetReturn(block: GetReturn.() -> Unit): GetReturn = (js("{}") as
    GetReturn).apply(block)

public inline fun GetDetails(block: GetDetails.() -> Unit): GetDetails = (js("{}") as
    GetDetails).apply(block)

public inline fun SetDetails(block: SetDetails.() -> Unit): SetDetails = (js("{}") as
    SetDetails).apply(block)

public inline fun ClearDetails(block: ClearDetails.() -> Unit): ClearDetails = (js("{}") as
    ClearDetails).apply(block)

public inline fun OnChangeListener(block: OnChangeListener.() -> Unit): OnChangeListener = (js("{}")
    as OnChangeListener).apply(block)

public inline fun ChromeSetting(block: ChromeSetting.() -> Unit): ChromeSetting = (js("{}") as
    ChromeSetting).apply(block)
