package browser.chromeosInfoPrivate

import kotlin.String

/**
 * Status of enterprise enrollment.
 */
public enum class ManagedDeviceStatus(
  private val `value`: String,
) {
  managed("managed"),
  not_managed("not managed"),
  ;

  public override fun toString(): String = value
}
