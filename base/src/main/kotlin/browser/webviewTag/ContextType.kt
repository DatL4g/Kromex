package browser.webviewTag

import kotlin.String

/**
 * The different contexts a menu can appear in. Specifying 'all' is equivalent to the combination of
 * all other contexts.
 */
public enum class ContextType(
  private val `value`: String,
) {
  all("all"),
  page("page"),
  frame("frame"),
  selection("selection"),
  link("link"),
  editable("editable"),
  image("image"),
  video("video"),
  audio("audio"),
  ;

  public override fun toString(): String = value
}
