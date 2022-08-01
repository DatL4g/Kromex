package browser.inputMethodPrivate

import kotlin.String

/**
 * Type of keyboard to show for this text field, (Text, Number, URL, etc) set by mode property of
 * input tag
 */
public enum class InputModeType(
  private val `value`: String,
) {
  noKeyboard("noKeyboard"),
  text("text"),
  tel("tel"),
  url("url"),
  email("email"),
  numeric("numeric"),
  decimal("decimal"),
  search("search"),
  ;

  public override fun toString(): String = value
}
