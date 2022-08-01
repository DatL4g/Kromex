package browser.inputMethodPrivate

import kotlin.String

/**
 * Describes how the text field was focused
 */
public enum class FocusReason(
  private val `value`: String,
) {
  mouse("mouse"),
  touch("touch"),
  pen("pen"),
  other("other"),
  ;

  public override fun toString(): String = value
}
