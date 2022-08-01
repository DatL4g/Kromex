@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.tts

public inline fun TtsOptions(block: TtsOptions.() -> Unit): TtsOptions = (js("{}") as
    TtsOptions).apply(block)

public inline fun TtsEvent(block: TtsEvent.() -> Unit): TtsEvent = (js("{}") as
    TtsEvent).apply(block)

public inline fun TtsVoice(block: TtsVoice.() -> Unit): TtsVoice = (js("{}") as
    TtsVoice).apply(block)

public inline fun OnEventListener(block: OnEventListener.() -> Unit): OnEventListener = (js("{}") as
    OnEventListener).apply(block)
