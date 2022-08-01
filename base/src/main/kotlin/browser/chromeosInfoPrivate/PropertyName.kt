package browser.chromeosInfoPrivate

import kotlin.String

/**
 * Chrome OS system property name
 */
public enum class PropertyName(
  private val `value`: String,
) {
  timezone("timezone"),
  a11yLargeCursorEnabled("a11yLargeCursorEnabled"),
  a11yStickyKeysEnabled("a11yStickyKeysEnabled"),
  a11ySpokenFeedbackEnabled("a11ySpokenFeedbackEnabled"),
  a11yHighContrastEnabled("a11yHighContrastEnabled"),
  a11yScreenMagnifierEnabled("a11yScreenMagnifierEnabled"),
  a11yAutoClickEnabled("a11yAutoClickEnabled"),
  a11yVirtualKeyboardEnabled("a11yVirtualKeyboardEnabled"),
  a11yCaretHighlightEnabled("a11yCaretHighlightEnabled"),
  a11yCursorHighlightEnabled("a11yCursorHighlightEnabled"),
  a11yFocusHighlightEnabled("a11yFocusHighlightEnabled"),
  a11ySelectToSpeakEnabled("a11ySelectToSpeakEnabled"),
  a11ySwitchAccessEnabled("a11ySwitchAccessEnabled"),
  a11yCursorColorEnabled("a11yCursorColorEnabled"),
  a11yDockedMagnifierEnabled("a11yDockedMagnifierEnabled"),
  sendFunctionKeys("sendFunctionKeys"),
  ;

  public override fun toString(): String = value
}
