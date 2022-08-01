@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.cookies

public inline fun Cookie(block: Cookie.() -> Unit): Cookie = (js("{}") as Cookie).apply(block)

public inline fun CookieStore(block: CookieStore.() -> Unit): CookieStore = (js("{}") as
    CookieStore).apply(block)

public inline fun CookieDetails(block: CookieDetails.() -> Unit): CookieDetails = (js("{}") as
    CookieDetails).apply(block)

public inline fun GetAllDetails(block: GetAllDetails.() -> Unit): GetAllDetails = (js("{}") as
    GetAllDetails).apply(block)

public inline fun SetDetails(block: SetDetails.() -> Unit): SetDetails = (js("{}") as
    SetDetails).apply(block)

public inline fun RemoveReturn(block: RemoveReturn.() -> Unit): RemoveReturn = (js("{}") as
    RemoveReturn).apply(block)

public inline fun OnChangedListener(block: OnChangedListener.() -> Unit): OnChangedListener =
    (js("{}") as OnChangedListener).apply(block)
