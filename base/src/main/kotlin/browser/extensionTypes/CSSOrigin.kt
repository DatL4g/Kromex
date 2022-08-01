package browser.extensionTypes

import kotlin.String

/**
 * The <a href="https://www.w3.org/TR/css3-cascade/#cascading-origins">origin</a> of injected CSS.
 */
public enum class CSSOrigin(
  private val `value`: String,
) {
  author("author"),
  user("user"),
  ;

  public override fun toString(): String = value
}
