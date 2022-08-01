package browser.accessibilityPrivate

import kotlin.String

/**
 * Commands for magnifier (e.g. move magnifier viewport up).
 */
public enum class MagnifierCommand(
  private val `value`: String,
) {
  moveStop("moveStop"),
  moveUp("moveUp"),
  moveDown("moveDown"),
  moveLeft("moveLeft"),
  moveRight("moveRight"),
  ;

  public override fun toString(): String = value
}
