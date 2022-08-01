package browser.input.ime

import kotlin.String

/**
 * Which mouse buttons was clicked.
 */
public enum class MouseButton(
  private val `value`: String,
) {
  left("left"),
  middle("middle"),
  right("right"),
  ;

  public override fun toString(): String = value
}
