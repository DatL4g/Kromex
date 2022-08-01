package browser.proxy

import kotlin.String

public enum class Mode(
  private val `value`: String,
) {
  direct("direct"),
  auto_detect("auto_detect"),
  pac_script("pac_script"),
  fixed_servers("fixed_servers"),
  system("system"),
  ;

  public override fun toString(): String = value
}
