package browser.accessibilityPrivate

import kotlin.String

/**
 * Accessibility gestures fired by the touch exploration controller.
 */
public enum class Gesture(
  private val `value`: String,
) {
  click("click"),
  swipeLeft1("swipeLeft1"),
  swipeUp1("swipeUp1"),
  swipeRight1("swipeRight1"),
  swipeDown1("swipeDown1"),
  swipeLeft2("swipeLeft2"),
  swipeUp2("swipeUp2"),
  swipeRight2("swipeRight2"),
  swipeDown2("swipeDown2"),
  swipeLeft3("swipeLeft3"),
  swipeUp3("swipeUp3"),
  swipeRight3("swipeRight3"),
  swipeDown3("swipeDown3"),
  swipeLeft4("swipeLeft4"),
  swipeUp4("swipeUp4"),
  swipeRight4("swipeRight4"),
  swipeDown4("swipeDown4"),
  tap2("tap2"),
  tap3("tap3"),
  tap4("tap4"),
  touchExplore("touchExplore"),
  ;

  public override fun toString(): String = value
}
