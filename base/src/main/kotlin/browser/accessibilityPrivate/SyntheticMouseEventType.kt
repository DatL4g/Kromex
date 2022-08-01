package browser.accessibilityPrivate

import kotlin.String

/**
 * The type of event to send
 */
public enum class SyntheticMouseEventType(
  private val `value`: String,
) {
  press("press"),
  release("release"),
  drag("drag"),
  move("move"),
  enter("enter"),
  exit("exit"),
  ;

  public override fun toString(): String = value
}
