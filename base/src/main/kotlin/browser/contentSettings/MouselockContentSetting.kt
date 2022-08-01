package browser.contentSettings

import kotlin.String

public enum class MouselockContentSetting(
  private val `value`: String,
) {
  allow("allow"),
  ;

  public override fun toString(): String = value
}
