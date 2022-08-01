package browser.input.ime

import kotlin.String

/**
 * Type of assistive window.
 */
public enum class AssistiveWindowType(
  private val `value`: String,
) {
  undo("undo"),
  ;

  public override fun toString(): String = value
}
