package browser.contentSettings

import kotlin.String

public enum class ImagesContentSetting(
  private val `value`: String,
) {
  allow("allow"),
  block("block"),
  ;

  public override fun toString(): String = value
}
