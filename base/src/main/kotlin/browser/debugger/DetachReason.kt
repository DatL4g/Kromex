package browser.debugger

import kotlin.String

/**
 * Connection termination reason.
 */
public enum class DetachReason(
  private val `value`: String,
) {
  target_closed("target_closed"),
  canceled_by_user("canceled_by_user"),
  ;

  public override fun toString(): String = value
}
