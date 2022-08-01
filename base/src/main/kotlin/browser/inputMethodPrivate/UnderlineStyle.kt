package browser.inputMethodPrivate

import kotlin.String

/**
 * The type of the underline to modify a composition segment.
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
