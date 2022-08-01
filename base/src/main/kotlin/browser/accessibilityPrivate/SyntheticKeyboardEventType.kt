package browser.accessibilityPrivate

import kotlin.String

/**
 * The event to send
 */
public enum class SyntheticKeyboardEventType(
  private val `value`: String,
) {
  keyup("keyup"),
  keydown("keydown"),
  ;

  public override fun toString(): String = value
}
