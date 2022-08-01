package browser.contentSettings

import kotlin.String

public enum class PpapiBrokerContentSetting(
  private val `value`: String,
) {
  allow("allow"),
  block("block"),
  ask("ask"),
  ;

  public override fun toString(): String = value
}
