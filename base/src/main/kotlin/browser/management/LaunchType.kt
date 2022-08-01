package browser.management

import kotlin.String

/**
 * These are all possible app launch types.
 */
public enum class LaunchType(
  private val `value`: String,
) {
  OPEN_AS_REGULAR_TAB("OPEN_AS_REGULAR_TAB"),
  OPEN_AS_PINNED_TAB("OPEN_AS_PINNED_TAB"),
  OPEN_AS_WINDOW("OPEN_AS_WINDOW"),
  OPEN_FULL_SCREEN("OPEN_FULL_SCREEN"),
  ;

  public override fun toString(): String = value
}
