package browser.virtualKeyboardPrivate

import kotlin.String

/**
 * The value of the virtual keyboard mode to set to.
 */
public enum class KeyboardMode(
  private val `value`: String,
) {
  FULL_WIDTH("FULL_WIDTH"),
  FLOATING("FLOATING"),
  ;

  public override fun toString(): String = value
}
