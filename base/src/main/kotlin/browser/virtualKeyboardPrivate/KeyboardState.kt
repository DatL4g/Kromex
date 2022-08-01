package browser.virtualKeyboardPrivate

import kotlin.String

/**
 * The value of the virtual keyboard state to change to.
 */
public enum class KeyboardState(
  private val `value`: String,
) {
  ENABLED("ENABLED"),
  DISABLED("DISABLED"),
  AUTO("AUTO"),
  ;

  public override fun toString(): String = value
}
