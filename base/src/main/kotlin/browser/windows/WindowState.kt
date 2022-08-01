package browser.windows

import kotlin.String

/**
 * The state of this browser window. In some circumstances a window may not be assigned a
 * <code>state</code> property; for example, when querying closed windows from the $(ref:sessions) API.
 */
public enum class WindowState(
  private val `value`: String,
) {
  /**
   * Normal window state (not minimized, maximized, or fullscreen).
   */
  normal("normal"),
  /**
   * Minimized window state.
   */
  minimized("minimized"),
  /**
   * Maximized window state.
   */
  maximized("maximized"),
  /**
   * Fullscreen window state.
   */
  fullscreen("fullscreen"),
  /**
   * Locked fullscreen window state. This fullscreen state cannot be exited by user action and is
   * available only to allowlisted extensions on Chrome OS.
   */
  locked_fullscreen("locked-fullscreen"),
  ;

  public override fun toString(): String = value
}
