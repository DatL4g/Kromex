@file:JsModule("webextension-polyfill")
@file:JsQualifier("ttsEngine")

package browser.ttsEngine

import browser.events.Event
import browser.tts.TtsEvent
import browser.tts.TtsVoice
import kotlin.js.Promise

/**
 * Called by an engine to update its list of voices. This list overrides any voices declared in this
 * extension's manifest.
 *
 * @param voices Array of $(ref:tts.TtsVoice) objects representing the available voices for speech
 * synthesis.
 */
public external fun updateVoices(voices: Array<TtsVoice>): Nothing

/**
 * Routes a TTS event from a speech engine to a client.
 * @param event The update event from the text-to-speech engine indicating the status of this
 * utterance.
 */
public external fun sendTtsEvent(requestId: Int, event: TtsEvent): Nothing

/**
 * Routes TTS audio from a speech engine to a client.
 * @param audio An audio buffer from the text-to-speech engine.
 */
public external fun sendTtsAudio(requestId: Int, audio: AudioBuffer): Nothing

/**
 * Called when the user makes a call to tts.speak() and one of the voices from this extension's
 * manifest is the first to match the options object.
 */
public external val onSpeak: Event<OnSpeakListener, Promise<TtsEvent>> = definedExternally

/**
 * Called when the user makes a call to tts.speak() and one of the voices from this extension's
 * manifest is the first to match the options object. Differs from ttsEngine.onSpeak in that Chrome
 * provides audio playback services and handles dispatching tts events.
 */
public external val onSpeakWithAudioStream: Event<OnSpeakWithAudioStreamListener, Promise<String?>>
    = definedExternally

/**
 * Fired when a call is made to tts.stop and this extension may be in the middle of speaking. If an
 * extension receives a call to onStop and speech is already stopped, it should do nothing (not raise
 * an error). If speech is in the paused state, this should cancel the paused state.
 */
public external val onStop: Event<Nothing, Unit> = definedExternally

/**
 * Optional: if an engine supports the pause event, it should pause the current utterance being
 * spoken, if any, until it receives a resume event or stop event. Note that a stop event should also
 * clear the paused state.
 */
public external val onPause: Event<Nothing, Unit> = definedExternally

/**
 * Optional: if an engine supports the pause event, it should also support the resume event, to
 * continue speaking the current utterance, if any. Note that a stop event should also clear the paused
 * state.
 */
public external val onResume: Event<Nothing, Unit> = definedExternally
