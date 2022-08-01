package browser.tts

import kotlin.String

public enum class VoiceGender(
  private val `value`: String,
) {
  male("male"),
  female("female"),
  ;

  public override fun toString(): String = value
}
