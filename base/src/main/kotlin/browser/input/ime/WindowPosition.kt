package browser.input.ime

import kotlin.String

/**
 * Where to display the candidate window. If set to 'cursor', the window follows the cursor. If set
 * to 'composition', the window is locked to the beginning of the composition.
 */
public enum class WindowPosition(
  private val `value`: String,
) {
  cursor("cursor"),
  composition("composition"),
  ;

  public override fun toString(): String = value
}
