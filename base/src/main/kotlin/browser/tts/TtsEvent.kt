@file:JsModule("webextension-polyfill")
@file:JsQualifier("tts")

package browser.tts

/**
 * An event from the TTS engine to communicate the status of an utterance.
 */
public external interface TtsEvent {
  /**
   * The type can be <code>start</code> as soon as speech has started, <code>word</code> when a word
   * boundary is reached, <code>sentence</code> when a sentence boundary is reached,
   * <code>marker</code> when an SSML mark element is reached, <code>end</code> when the end of the
   * utterance is reached, <code>interrupted</code> when the utterance is stopped or interrupted before
   * reaching the end, <code>cancelled</code> when it's removed from the queue before ever being
   * synthesized, or <code>error</code> when any other error occurs. When pausing speech, a
   * <code>pause</code> event is fired if a particular utterance is paused in the middle, and
   * <code>resume</code> if an utterance resumes speech. Note that pause and resume events may not fire
   * if speech is paused in-between utterances.
   */
  public var type: EventType

  /**
   * The index of the current character in the utterance. For word events, the event fires at the
   * end of one word and before the beginning of the next. The <code>charIndex</code> represents a
   * point in the text at the beginning of the next word to be spoken.
   */
  public var charIndex: Int?

  /**
   * The error description, if the event type is <code>error</code>.
   */
  public var errorMessage: String?

  /**
   * An ID unique to the calling function's context so that events can get routed back to the
   * correct tts.speak call.
   */
  public var srcId: Number?

  /**
   * True if this is the final event that will be sent to this handler.
   */
  public var isFinalEvent: Boolean?

  /**
   * The length of the next part of the utterance. For example, in a <code>word</code> event, this
   * is the length of the word which will be spoken next. It will be set to -1 if not set by the speech
   * engine.
   */
  public var length: Int?
}
