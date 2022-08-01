package browser.contentSettings

import kotlin.String

public enum class FullscreenContentSetting(
  private val `value`: String,
) {
  allow("allow"),
  ;

  public override fun toString(): String = value
}
