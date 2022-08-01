package browser.accessibilityPrivate

import kotlin.String

/**
 * Different Switch Access bubbles that can be shown or hidden.
 */
public enum class SwitchAccessBubble(
  private val `value`: String,
) {
  backButton("backButton"),
  menu("menu"),
  ;

  public override fun toString(): String = value
}
