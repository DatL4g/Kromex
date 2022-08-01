package browser.runtime

import kotlin.String

/**
 * Result of the update check.
 */
public enum class RequestUpdateCheckStatus(
  private val `value`: String,
) {
  throttled("throttled"),
  no_update("no_update"),
  update_available("update_available"),
  ;

  public override fun toString(): String = value
}
