package browser.contentSettings

import kotlin.String

public enum class PluginsContentSetting(
  private val `value`: String,
) {
  block("block"),
  ;

  public override fun toString(): String = value
}
