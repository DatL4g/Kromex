package browser.tabs

import kotlin.String

/**
 * The type of window.
 */
public enum class WindowType(
  private val `value`: String,
) {
  normal("normal"),
  popup("popup"),
  panel("panel"),
  app("app"),
  devtools("devtools"),
  ;

  public override fun toString(): String = value
}
