package browser.accessibilityPrivate

import kotlin.String

/**
 * Available actions to be shown in the Switch Access menu. Must be kept in sync with the strings in
 * ash/system/accessibility/switch_access/switch_access_menu_view.cc
 */
public enum class SwitchAccessMenuAction(
  private val `value`: String,
) {
  copy("copy"),
  cut("cut"),
  decrement("decrement"),
  dictation("dictation"),
  endTextSelection("endTextSelection"),
  increment("increment"),
  itemScan("itemScan"),
  jumpToBeginningOfText("jumpToBeginningOfText"),
  jumpToEndOfText("jumpToEndOfText"),
  keyboard("keyboard"),
  leftClick("leftClick"),
  moveBackwardOneCharOfText("moveBackwardOneCharOfText"),
  moveBackwardOneWordOfText("moveBackwardOneWordOfText"),
  moveCursor("moveCursor"),
  moveDownOneLineOfText("moveDownOneLineOfText"),
  moveForwardOneCharOfText("moveForwardOneCharOfText"),
  moveForwardOneWordOfText("moveForwardOneWordOfText"),
  moveUpOneLineOfText("moveUpOneLineOfText"),
  paste("paste"),
  pointScan("pointScan"),
  rightClick("rightClick"),
  scrollDown("scrollDown"),
  scrollLeft("scrollLeft"),
  scrollRight("scrollRight"),
  scrollUp("scrollUp"),
  select("select"),
  settings("settings"),
  startTextSelection("startTextSelection"),
  ;

  public override fun toString(): String = value
}
