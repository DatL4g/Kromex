@file:JsModule("webextension-polyfill")
@file:JsQualifier("ttsEngine")

package browser.ttsEngine

import org.w3c.dom.BinaryType

/**
 * Parameters containing an audio buffer and associated data.
 */
public external interface AudioBuffer {
  /**
   * The audio buffer from the text-to-speech engine. It should have length exactly
   * audioStreamOptions.bufferSize and encoded as mono, at audioStreamOptions.sampleRate, and as linear
   * pcm, 32-bit signed float i.e. the Float32Array type in javascript.
   */
  public var audioBuffer: BinaryType

  /**
   * The character index associated with this audio buffer.
   */
  public var charIndex: Int?

  /**
   * True if this audio buffer is the last for the text being spoken.
   */
  public var isLastBuffer: Boolean?
}
