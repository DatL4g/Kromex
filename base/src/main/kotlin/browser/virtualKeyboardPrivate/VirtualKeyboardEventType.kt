package browser.virtualKeyboardPrivate

import kotlin.String

/**
 * One of keyup or keydown.
 */
public enum class VirtualKeyboardEventType(
  private val `value`: String,
) {
  keyup("keyup"),
  keydown("keydown"),
  ;

  public override fun toString(): String = value
}
