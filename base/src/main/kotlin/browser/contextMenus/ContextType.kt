package browser.contextMenus

import kotlin.String

/**
 * The different contexts a menu can appear in. Specifying 'all' is equivalent to the combination of
 * all other contexts except for 'launcher'. The 'launcher' context is only supported by apps and is
 * used to add menu items to the context menu that appears when clicking the app icon in the
 * launcher/taskbar/dock/etc. Different platforms might put limitations on what is actually supported
 * in a launcher context menu.
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
  launcher("launcher"),
  browser_action("browser_action"),
  page_action("page_action"),
  action("action"),
  ;

  public override fun toString(): String = value
}
