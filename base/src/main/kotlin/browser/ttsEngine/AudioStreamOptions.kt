@file:JsModule("webextension-polyfill")
@file:JsQualifier("ttsEngine")

package browser.ttsEngine

/**
 * Contains the audio stream format expected to be produced by an engine.
 */
public external interface AudioStreamOptions {
  /**
   * The sample rate expected in an audio buffer.
   */
  public var sampleRate: Int

  /**
   * The number of samples within an audio buffer.
   */
  public var bufferSize: Int
}
