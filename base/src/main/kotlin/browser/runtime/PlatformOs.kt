package browser.runtime

import kotlin.String

/**
 * The operating system Chrome is running on.
 */
public enum class PlatformOs(
  private val `value`: String,
) {
  mac("mac"),
  win("win"),
  android("android"),
  cros("cros"),
  linux("linux"),
  openbsd("openbsd"),
  fuchsia("fuchsia"),
  ;

  public override fun toString(): String = value
}
