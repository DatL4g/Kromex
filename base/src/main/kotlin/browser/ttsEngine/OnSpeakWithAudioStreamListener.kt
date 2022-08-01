@file:JsModule("webextension-polyfill")
@file:JsQualifier("ttsEngine")

package browser.ttsEngine

/**
 * Called when the user makes a call to tts.speak() and one of the voices from this extension's
 * manifest is the first to match the options object. Differs from ttsEngine.onSpeak in that Chrome
 * provides audio playback services and handles dispatching tts events.
 */
public external interface OnSpeakWithAudioStreamListener {
  /**
   * The text to speak, specified as either plain text or an SSML document. If your engine does not
   * support SSML, you should strip out all XML markup and synthesize only the underlying text content.
   * The value of this parameter is guaranteed to be no more than 32,768 characters. If this engine
   * does not support speaking that many characters at a time, the utterance should be split into
   * smaller chunks and queued internally without returning an error.
   */
  public var utterance: String

  /**
   * Options specified to the tts.speak() method.
   */
  public var options: SpeakOptions

  /**
   * Contains the audio stream format expected to be produced by this engine.
   */
  public var audioStreamOptions: AudioStreamOptions

  /**
   * Call this function with audio that occur in the process of speaking the utterance.
   *
   * @param audioBufferParams Parameters containing an audio buffer and associated data.
   */
  public fun sendTtsAudio(audioBufferParams: AudioBuffer): Nothing

  /**
   * Call this function to indicate an error with rendering this utterance.
   *
   * @param errorMessage A string describing the error.
   */
  public fun sendError(errorMessage: String? = definedExternally): Nothing
}
