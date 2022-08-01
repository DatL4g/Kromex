package browser.accessibilityPrivate

import kotlin.String

/**
 * The type of visual appearance for the focus ring.
 */
public enum class FocusType(
  private val `value`: String,
) {
  glow("glow"),
  solid("solid"),
  dashed("dashed"),
  ;

  public override fun toString(): String = value
}
