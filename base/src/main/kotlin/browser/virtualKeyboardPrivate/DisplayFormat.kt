package browser.virtualKeyboardPrivate

import kotlin.String

/**
 * The display format associated with this item.
 */
public enum class DisplayFormat(
  private val `value`: String,
) {
  text("text"),
  png("png"),
  html("html"),
  `file`("file"),
  ;

  public override fun toString(): String = value
}
