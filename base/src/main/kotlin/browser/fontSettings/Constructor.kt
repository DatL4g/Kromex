@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.fontSettings

public inline fun FontName(block: FontName.() -> Unit): FontName = (js("{}") as
    FontName).apply(block)

public inline fun ClearFontDetails(block: ClearFontDetails.() -> Unit): ClearFontDetails = (js("{}")
    as ClearFontDetails).apply(block)

public inline fun GetFontReturn(block: GetFontReturn.() -> Unit): GetFontReturn = (js("{}") as
    GetFontReturn).apply(block)

public inline fun GetFontDetails(block: GetFontDetails.() -> Unit): GetFontDetails = (js("{}") as
    GetFontDetails).apply(block)

public inline fun SetFontDetails(block: SetFontDetails.() -> Unit): SetFontDetails = (js("{}") as
    SetFontDetails).apply(block)

public inline fun GetDefaultFontSizeReturn(block: GetDefaultFontSizeReturn.() -> Unit):
    GetDefaultFontSizeReturn = (js("{}") as GetDefaultFontSizeReturn).apply(block)

public inline fun SetDefaultFontSizeDetails(block: SetDefaultFontSizeDetails.() -> Unit):
    SetDefaultFontSizeDetails = (js("{}") as SetDefaultFontSizeDetails).apply(block)

public inline fun GetDefaultFixedFontSizeReturn(block: GetDefaultFixedFontSizeReturn.() -> Unit):
    GetDefaultFixedFontSizeReturn = (js("{}") as GetDefaultFixedFontSizeReturn).apply(block)

public inline fun SetDefaultFixedFontSizeDetails(block: SetDefaultFixedFontSizeDetails.() -> Unit):
    SetDefaultFixedFontSizeDetails = (js("{}") as SetDefaultFixedFontSizeDetails).apply(block)

public inline fun GetMinimumFontSizeReturn(block: GetMinimumFontSizeReturn.() -> Unit):
    GetMinimumFontSizeReturn = (js("{}") as GetMinimumFontSizeReturn).apply(block)

public inline fun SetMinimumFontSizeDetails(block: SetMinimumFontSizeDetails.() -> Unit):
    SetMinimumFontSizeDetails = (js("{}") as SetMinimumFontSizeDetails).apply(block)

public inline fun OnFontChangedListener(block: OnFontChangedListener.() -> Unit):
    OnFontChangedListener = (js("{}") as OnFontChangedListener).apply(block)

public inline
    fun OnDefaultFontSizeChangedListener(block: OnDefaultFontSizeChangedListener.() -> Unit):
    OnDefaultFontSizeChangedListener = (js("{}") as OnDefaultFontSizeChangedListener).apply(block)

public inline
    fun OnDefaultFixedFontSizeChangedListener(block: OnDefaultFixedFontSizeChangedListener.() -> Unit):
    OnDefaultFixedFontSizeChangedListener = (js("{}") as
    OnDefaultFixedFontSizeChangedListener).apply(block)

public inline
    fun OnMinimumFontSizeChangedListener(block: OnMinimumFontSizeChangedListener.() -> Unit):
    OnMinimumFontSizeChangedListener = (js("{}") as OnMinimumFontSizeChangedListener).apply(block)
