package browser.accessibilityPrivate

import kotlin.String

/**
 * Whether to stack focus rings above or below accessibility bubble panels. Note: focus rings will
 * be stacked above most other UI in either case
 */
public enum class FocusRingStackingOrder(
  private val `value`: String,
) {
  aboveAccessibilityBubbles("aboveAccessibilityBubbles"),
  belowAccessibilityBubbles("belowAccessibilityBubbles"),
  ;

  public override fun toString(): String = value
}
