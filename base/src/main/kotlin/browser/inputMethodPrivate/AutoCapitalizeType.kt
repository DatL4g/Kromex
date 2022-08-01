package browser.inputMethodPrivate

import kotlin.String

/**
 * The auto-capitalize type of the text field.
 */
public enum class AutoCapitalizeType(
  private val `value`: String,
) {
  off("off"),
  characters("characters"),
  words("words"),
  sentences("sentences"),
  ;

  public override fun toString(): String = value
}
