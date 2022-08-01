package browser.accessibilityPrivate

import kotlin.String

/**
 * Point scanning states in Switch Access.
 */
public enum class PointScanState(
  private val `value`: String,
) {
  start("start"),
  stop("stop"),
  ;

  public override fun toString(): String = value
}
