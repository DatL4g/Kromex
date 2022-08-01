package browser.systemPrivate

import kotlin.String

/**
 * Exposes whether the incognito mode is available to windows. One of 'enabled', 'disabled' (user
 * cannot browse pages in Incognito mode), 'forced' (all pages/sessions are forced into Incognito
 * mode).
 */
public enum class GetIncognitoModeAvailabilityValue(
  private val `value`: String,
) {
  enabled("enabled"),
  disabled("disabled"),
  forced("forced"),
  ;

  public override fun toString(): String = value
}
