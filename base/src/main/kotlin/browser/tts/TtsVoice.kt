@file:JsModule("webextension-polyfill")
@file:JsQualifier("tts")

package browser.tts

/**
 * A description of a voice available for speech synthesis.
 */
public external interface TtsVoice {
  /**
   * The name of the voice.
   */
  public var voiceName: String?

  /**
   * The language that this voice supports, in the form <em>language</em>-<em>region</em>. Examples:
   * 'en', 'en-US', 'en-GB', 'zh-CN'.
   */
  public var lang: String?

  /**
   * This voice's gender.
   */
  @Deprecated(
    message = "Gender is deprecated and will be ignored.",
    level = DeprecationLevel.WARNING,
  )
  public var gender: VoiceGender?

  /**
   * If true, the synthesis engine is a remote network resource. It may be higher latency and may
   * incur bandwidth costs.
   */
  public var remote: Boolean?

  /**
   * The ID of the extension providing this voice.
   */
  public var extensionId: String?

  /**
   * All of the callback event types that this voice is capable of sending.
   */
  public var eventTypes: Array<EventType>?
}
