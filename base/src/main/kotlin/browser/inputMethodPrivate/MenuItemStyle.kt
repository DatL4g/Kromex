package browser.inputMethodPrivate

import kotlin.String

/**
 * The type of menu item. Radio buttons between separators are considered grouped.
 */
public enum class MenuItemStyle(
  private val `value`: String,
) {
  check("check"),
  radio("radio"),
  separator("separator"),
  ;

  public override fun toString(): String = value
}
