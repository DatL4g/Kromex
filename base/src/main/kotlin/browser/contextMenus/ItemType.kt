package browser.contextMenus

import kotlin.String

/**
 * The type of menu item.
 */
public enum class ItemType(
  private val `value`: String,
) {
  normal("normal"),
  checkbox("checkbox"),
  radio("radio"),
  separator("separator"),
  ;

  public override fun toString(): String = value
}
