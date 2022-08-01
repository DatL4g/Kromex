package browser.accessibilityPrivate

import kotlin.String

/**
 * A subset of accelerator actions used by accessibility.
 */
public enum class AcceleratorAction(
  private val `value`: String,
) {
  focusPreviousPane("focusPreviousPane"),
  focusNextPane("focusNextPane"),
  ;

  public override fun toString(): String = value
}
