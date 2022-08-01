package browser.desktopCapture

import kotlin.String

/**
 * Mirrors <a
 * href="https://w3c.github.io/mediacapture-screen-share/#dom-systemaudiopreferenceenum">SystemAudioPreferenceEnum</a>.
 */
public enum class SystemAudioPreferenceEnum(
  private val `value`: String,
) {
  include("include"),
  exclude("exclude"),
  ;

  public override fun toString(): String = value
}
