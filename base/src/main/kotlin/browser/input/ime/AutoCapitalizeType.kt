package browser.input.ime

import kotlin.String

/**
 * The auto-capitalize type of the text field.
 */
public enum class AutoCapitalizeType(
  private val `value`: String,
) {
  characters("characters"),
  words("words"),
  sentences("sentences"),
  ;

  public override fun toString(): String = value
}
