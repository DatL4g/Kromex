@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.contentSettings

public inline fun ResourceIdentifier(block: ResourceIdentifier.() -> Unit): ResourceIdentifier =
    (js("{}") as ResourceIdentifier).apply(block)

public inline fun ClearDetails(block: ClearDetails.() -> Unit): ClearDetails = (js("{}") as
    ClearDetails).apply(block)

public inline fun GetReturn(block: GetReturn.() -> Unit): GetReturn = (js("{}") as
    GetReturn).apply(block)

public inline fun GetDetails(block: GetDetails.() -> Unit): GetDetails = (js("{}") as
    GetDetails).apply(block)

public inline fun SetDetails(block: SetDetails.() -> Unit): SetDetails = (js("{}") as
    SetDetails).apply(block)

public inline fun ContentSetting(block: ContentSetting.() -> Unit): ContentSetting = (js("{}") as
    ContentSetting).apply(block)
