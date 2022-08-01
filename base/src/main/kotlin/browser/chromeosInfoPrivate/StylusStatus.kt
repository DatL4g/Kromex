package browser.chromeosInfoPrivate

import kotlin.String

/**
 * Status of stylus.
 */
public enum class StylusStatus(
  private val `value`: String,
) {
  unsupported("unsupported"),
  supported("supported"),
  seen("seen"),
  ;

  public override fun toString(): String = value
}
