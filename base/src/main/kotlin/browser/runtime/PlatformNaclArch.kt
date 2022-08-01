package browser.runtime

import kotlin.String

/**
 * The native client architecture. This may be different from arch on some platforms.
 */
public enum class PlatformNaclArch(
  private val `value`: String,
) {
  arm("arm"),
  x86_32("x86-32"),
  x86_64("x86-64"),
  mips("mips"),
  mips64("mips64"),
  ;

  public override fun toString(): String = value
}
