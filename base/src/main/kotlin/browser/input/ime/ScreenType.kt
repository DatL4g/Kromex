package browser.input.ime

import kotlin.String

/**
 * The screen type under which the IME is activated.
 */
public enum class ScreenType(
  private val `value`: String,
) {
  normal("normal"),
  login("login"),
  lock("lock"),
  secondary_login("secondary-login"),
  ;

  public override fun toString(): String = value
}
