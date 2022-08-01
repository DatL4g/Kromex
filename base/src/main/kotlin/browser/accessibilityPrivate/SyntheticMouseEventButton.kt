package browser.accessibilityPrivate

import kotlin.String

/**
 * The button to send event on
 */
public enum class SyntheticMouseEventButton(
  private val `value`: String,
) {
  left("left"),
  middle("middle"),
  right("right"),
  back("back"),
  foward("foward"),
  ;

  public override fun toString(): String = value
}
