package browser.input.ime

import kotlin.String

/**
 * ID of buttons in assistive window.
 */
public enum class AssistiveWindowButton(
  private val `value`: String,
) {
  undo("undo"),
  addToDictionary("addToDictionary"),
  ;

  public override fun toString(): String = value
}
