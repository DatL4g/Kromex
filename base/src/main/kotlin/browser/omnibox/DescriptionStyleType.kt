package browser.omnibox

import kotlin.String

/**
 * The style type.
 */
public enum class DescriptionStyleType(
  private val `value`: String,
) {
  url("url"),
  match("match"),
  dim("dim"),
  ;

  public override fun toString(): String = value
}
