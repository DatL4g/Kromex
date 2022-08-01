package browser.extension

import kotlin.String

/**
 * The type of extension view.
 */
public enum class ViewType(
  private val `value`: String,
) {
  tab("tab"),
  popup("popup"),
  ;

  public override fun toString(): String = value
}
