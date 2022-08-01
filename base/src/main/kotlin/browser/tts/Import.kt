@file:JsModule("webextension-polyfill")
@file:JsQualifier("tts")

package browser.tts

import browser.events.Event
import kotlin.js.Promise

/**
 * Speaks text using a text-to-speech engine.
 *
 * @param utterance The text to speak, either plain text or a complete, well-formed SSML document.
 * Speech engines that do not support SSML will strip away the tags and speak the text. The maximum
 * length of the text is 32,768 characters.
 * @param options The speech options.
 * @return Called right away, before speech finishes. Check $(ref:runtime.lastError) to make sure
 * there were no errors. Use options.onEvent to get more detailed feedback.
 */
public external fun speak(utterance: String, options: TtsOptions? = definedExternally):
    Promise<Nothing>?

/**
 * Stops any current speech and flushes the queue of any pending utterances. In addition, if speech
 * was paused, it will now be un-paused for the next call to speak.
 */
public external fun stop(): Nothing

/**
 * Pauses speech synthesis, potentially in the middle of an utterance. A call to resume or stop will
 * un-pause speech.
 */
public external fun pause(): Nothing

/**
 * If speech was paused, resumes speaking where it left off.
 */
public external fun resume(): Nothing

/**
 * Checks whether the engine is currently speaking. On Mac OS X, the result is true whenever the
 * system speech engine is speaking, even if the speech wasn't initiated by Chrome.
 */
public external fun isSpeaking(): Promise<Boolean>?

/**
 * Gets an array of all available voices.
 */
public external fun getVoices(): Promise<Array<TtsVoice>>?

/**
 * Used to pass events back to the function calling speak().
 */
public external val onEvent: Event<OnEventListener, Unit> = definedExternally
