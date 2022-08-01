package browser.contentSettings

import kotlin.String

public enum class CookiesContentSetting(
  private val `value`: String,
) {
  allow("allow"),
  block("block"),
  session_only("session_only"),
  ;

  public override fun toString(): String = value
}
