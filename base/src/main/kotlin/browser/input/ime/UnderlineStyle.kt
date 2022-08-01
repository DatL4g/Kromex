package browser.input.ime

import kotlin.String

/**
 * The type of the underline to modify this segment.
 */
public enum class UnderlineStyle(
  private val `value`: String,
) {
  underline("underline"),
  doubleUnderline("doubleUnderline"),
  noUnderline("noUnderline"),
  ;

  public override fun toString(): String = value
}
