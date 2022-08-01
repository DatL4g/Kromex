@file:JsModule("webextension-polyfill")
@file:JsQualifier("tts")

package browser.tts

/**
 * Used to pass events back to the function calling speak().
 */
public external interface OnEventListener {
  /**
   * The event from the text-to-speech engine indicating the status of this utterance.
   */
  public var event: TtsEvent
}
