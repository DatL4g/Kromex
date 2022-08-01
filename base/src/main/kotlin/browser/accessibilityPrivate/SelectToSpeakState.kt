package browser.accessibilityPrivate

import kotlin.String

/**
 * The state of the Select-to-Speak extension
 */
public enum class SelectToSpeakState(
  private val `value`: String,
) {
  selecting("selecting"),
  speaking("speaking"),
  inactive("inactive"),
  ;

  public override fun toString(): String = value
}
