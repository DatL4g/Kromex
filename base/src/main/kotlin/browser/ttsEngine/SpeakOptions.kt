@file:JsModule("webextension-polyfill")
@file:JsQualifier("ttsEngine")

package browser.ttsEngine

/**
 * Options specified to the tts.speak() method.
 */
public external interface SpeakOptions {
  /**
   * The name of the voice to use for synthesis.
   */
  public var voiceName: String?

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
   * around 180 to 220 words per minute. 2.0 is twice as fast, and 0.5 is half as fast. This value is
   * guaranteed to be between 0.1 and 10.0, inclusive. When a voice does not support this full range of
   * rates, don't return an error. Instead, clip the rate to the range the voice supports.
   */
  public var rate: Number?

  /**
   * Speaking pitch between 0 and 2 inclusive, with 0 being lowest and 2 being highest. 1.0
   * corresponds to this voice's default pitch.
   */
  public var pitch: Number?

  /**
   * Speaking volume between 0 and 1 inclusive, with 0 being lowest and 1 being highest, with a
   * default of 1.0.
   */
  public var volume: Number?
}
