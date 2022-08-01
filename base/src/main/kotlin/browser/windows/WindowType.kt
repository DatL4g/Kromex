package browser.windows

import kotlin.String

/**
 * The type of browser window this is. In some circumstances a window may not be assigned a
 * <code>type</code> property; for example, when querying closed windows from the $(ref:sessions) API.
 */
public enum class WindowType(
  private val `value`: String,
) {
  /**
   * A normal browser window.
   */
  normal("normal"),
  /**
   * A browser popup.
   */
  popup("popup"),
  /**
   * <i>Deprecated in this API.</i> A Chrome App panel-style window. Extensions can only see their
   * own panel windows.
   */
  panel("panel"),
  /**
   * <i>Deprecated in this API.</i> A Chrome App window. Extensions can only see their app own
   * windows.
   */
  app("app"),
  /**
   * A Developer Tools window.
   */
  devtools("devtools"),
  ;

  public override fun toString(): String = value
}
