package browser.chromeosInfoPrivate

import kotlin.String

/**
 * Current session type.
 */
public enum class SessionType(
  private val `value`: String,
) {
  normal("normal"),
  kiosk("kiosk"),
  public_session("public session"),
  ;

  public override fun toString(): String = value
}
