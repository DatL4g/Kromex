package browser.contentSettings

import kotlin.String

public enum class PopupsContentSetting(
  private val `value`: String,
) {
  allow("allow"),
  block("block"),
  ;

  public override fun toString(): String = value
}
