package browser.windows

import kotlin.String

/**
 * Specifies what type of browser window to create. 'panel' is deprecated and is available only to
 * existing whitelisted extensions on Chrome OS.
 */
public enum class CreateType(
  private val `value`: String,
) {
  normal("normal"),
  popup("popup"),
  panel("panel"),
  ;

  public override fun toString(): String = value
}
