package browser.input.ime

import kotlin.String

public enum class KeyboardEventType(
  private val `value`: String,
) {
  keyup("keyup"),
  keydown("keydown"),
  ;

  public override fun toString(): String = value
}
