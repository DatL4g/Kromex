package browser.management

import kotlin.String

/**
 * A reason the item is disabled.
 */
public enum class ExtensionDisabledReason(
  private val `value`: String,
) {
  unknown("unknown"),
  permissions_increase("permissions_increase"),
  ;

  public override fun toString(): String = value
}
