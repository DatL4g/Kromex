package browser.chromeosInfoPrivate

import kotlin.String

/**
 * Status of the play store. Note: 'available' means that the device supports the playstore but it
 * is not enabled.
 */
public enum class PlayStoreStatus(
  private val `value`: String,
) {
  not_available("not available"),
  available("available"),
  enabled("enabled"),
  ;

  public override fun toString(): String = value
}
