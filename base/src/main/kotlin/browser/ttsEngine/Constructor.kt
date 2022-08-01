@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.ttsEngine

public inline fun SpeakOptions(block: SpeakOptions.() -> Unit): SpeakOptions = (js("{}") as
    SpeakOptions).apply(block)

public inline fun AudioStreamOptions(block: AudioStreamOptions.() -> Unit): AudioStreamOptions =
    (js("{}") as AudioStreamOptions).apply(block)

public inline fun AudioBuffer(block: AudioBuffer.() -> Unit): AudioBuffer = (js("{}") as
    AudioBuffer).apply(block)

public inline fun OnSpeakListener(block: OnSpeakListener.() -> Unit): OnSpeakListener = (js("{}") as
    OnSpeakListener).apply(block)

public inline fun OnSpeakWithAudioStreamListener(block: OnSpeakWithAudioStreamListener.() -> Unit):
    OnSpeakWithAudioStreamListener = (js("{}") as OnSpeakWithAudioStreamListener).apply(block)
