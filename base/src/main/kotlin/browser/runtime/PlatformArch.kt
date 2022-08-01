package browser.runtime

import kotlin.String

/**
 * The machine's processor architecture.
 */
public enum class PlatformArch(
  private val `value`: String,
) {
  arm("arm"),
  arm64("arm64"),
  x86_32("x86-32"),
  x86_64("x86-64"),
  mips("mips"),
  mips64("mips64"),
  ;

  public override fun toString(): String = value
}
