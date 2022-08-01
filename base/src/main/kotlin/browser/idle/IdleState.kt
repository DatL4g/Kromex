package browser.idle

import kotlin.String

public enum class IdleState(
  private val `value`: String,
) {
  active("active"),
  idle("idle"),
  locked("locked"),
  ;

  public override fun toString(): String = value
}
