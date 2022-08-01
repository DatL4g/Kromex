package browser.chromeosInfoPrivate

import kotlin.String

/**
 * Device type.
 */
public enum class DeviceType(
  private val `value`: String,
) {
  chromebase("chromebase"),
  chromebit("chromebit"),
  chromebook("chromebook"),
  chromebox("chromebox"),
  chromedevice("chromedevice"),
  ;

  public override fun toString(): String = value
}
