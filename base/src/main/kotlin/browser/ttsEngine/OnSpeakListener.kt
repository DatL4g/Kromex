@file:JsModule("webextension-polyfill")
@file:JsQualifier("ttsEngine")

package browser.ttsEngine

import browser.tts.TtsEvent

/**
 * Called when the user makes a call to tts.speak() and one of the voices from this extension's
 * manifest is the first to match the options object.
 */
public external interface OnSpeakListener {
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
   * Call this function with events that occur in the process of speaking the utterance.
   *
   * @param event The event from the text-to-speech engine indicating the status of this utterance.
   */
  public fun sendTtsEvent(event: TtsEvent): Nothing
}
