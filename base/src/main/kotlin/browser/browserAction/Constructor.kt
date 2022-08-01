@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.browserAction

public typealias ColorArray = Array<Int>

public inline fun ImageDataType(block: ImageDataType.() -> Unit): ImageDataType = (js("{}") as
    ImageDataType).apply(block)

public inline fun TabDetails(block: TabDetails.() -> Unit): TabDetails = (js("{}") as
    TabDetails).apply(block)

public inline fun SetTitleDetails(block: SetTitleDetails.() -> Unit): SetTitleDetails = (js("{}") as
    SetTitleDetails).apply(block)

public inline fun SetIconDetails(block: SetIconDetails.() -> Unit): SetIconDetails = (js("{}") as
    SetIconDetails).apply(block)

public inline fun SetPopupDetails(block: SetPopupDetails.() -> Unit): SetPopupDetails = (js("{}") as
    SetPopupDetails).apply(block)

public inline fun SetBadgeTextDetails(block: SetBadgeTextDetails.() -> Unit): SetBadgeTextDetails =
    (js("{}") as SetBadgeTextDetails).apply(block)

public inline fun SetBadgeBackgroundColorDetails(block: SetBadgeBackgroundColorDetails.() -> Unit):
    SetBadgeBackgroundColorDetails = (js("{}") as SetBadgeBackgroundColorDetails).apply(block)

public inline fun OnClickedListener(block: OnClickedListener.() -> Unit): OnClickedListener =
    (js("{}") as OnClickedListener).apply(block)
