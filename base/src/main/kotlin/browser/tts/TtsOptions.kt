@file:JsModule("webextension-polyfill")
@file:JsQualifier("tts")

package browser.tts

/**
 * The speech options for the TTS engine.
 */
public external interface TtsOptions {
  /**
   * If true, enqueues this utterance if TTS is already in progress. If false (the default),
   * interrupts any current speech and flushes the speech queue before speaking this new utterance.
   */
  public var enqueue: Boolean?

  /**
   * The name of the voice to use for synthesis. If empty, uses any available voice.
   */
  public var voiceName: String?

  /**
   * The extension ID of the speech engine to use, if known.
   */
  public var extensionId: String?

  /**
   * The language to be used for synthesis, in the form <em>language</em>-<em>region</em>. Examples:
   * 'en', 'en-US', 'en-GB', 'zh-CN'.
   */
  public var lang: String?

  /**
   * Gender of voice for synthesized speech.
   */
  @Deprecated(
    message = "Gender is deprecated and will be ignored.",
    level = DeprecationLevel.WARNING,
  )
  public var gender: VoiceGender?

  /**
   * Speaking rate relative to the default rate for this voice. 1.0 is the default rate, normally
   * around 180 to 220 words per minute. 2.0 is twice as fast, and 0.5 is half as fast. Values below
   * 0.1 or above 10.0 are strictly disallowed, but many voices will constrain the minimum and maximum
   * rates further&mdash;for example a particular voice may not actually speak faster than 3 times
   * normal even if you specify a value larger than 3.0.
   */
  public var rate: Number?

  /**
   * Speaking pitch between 0 and 2 inclusive, with 0 being lowest and 2 being highest. 1.0
   * corresponds to a voice's default pitch.
   */
  public var pitch: Number?

  /**
   * Speaking volume between 0 and 1 inclusive, with 0 being lowest and 1 being highest, with a
   * default of 1.0.
   */
  public var volume: Number?

  /**
   * The TTS event types the voice must support.
   */
  public var requiredEventTypes: Array<String>?

  /**
   * The TTS event types that you are interested in listening to. If missing, all event types may be
   * sent.
   */
  public var desiredEventTypes: Array<String>?

  /**
   * This function is called with events that occur in the process of speaking the utterance.
   *
   * @param event The update event from the text-to-speech engine indicating the status of this
   * utterance.
   */
  public fun onEvent(event: TtsEvent): Nothing
}
