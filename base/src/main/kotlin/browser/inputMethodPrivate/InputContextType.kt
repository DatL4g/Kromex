package browser.inputMethodPrivate

import kotlin.String

/**
 * Type of value this text field edits, (Text, Number, URL, etc)
 */
public enum class InputContextType(
  private val `value`: String,
) {
  text("text"),
  search("search"),
  tel("tel"),
  url("url"),
  email("email"),
  number("number"),
  password("password"),
  `null`("null"),
  ;

  public override fun toString(): String = value
}
