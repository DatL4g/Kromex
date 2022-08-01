@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.i18n

public inline fun LanguageCode(block: LanguageCode.() -> Unit): LanguageCode = (js("{}") as
    LanguageCode).apply(block)

public inline fun GetMessageOptions(block: GetMessageOptions.() -> Unit): GetMessageOptions =
    (js("{}") as GetMessageOptions).apply(block)

public inline fun DetectLanguageReturn(block: DetectLanguageReturn.() -> Unit): DetectLanguageReturn
    = (js("{}") as DetectLanguageReturn).apply(block)
