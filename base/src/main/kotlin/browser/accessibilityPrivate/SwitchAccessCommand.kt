package browser.accessibilityPrivate

import kotlin.String

/**
 * Commands that can be triggered by switch activation.
 */
public enum class SwitchAccessCommand(
  private val `value`: String,
) {
  select("select"),
  next("next"),
  previous("previous"),
  ;

  public override fun toString(): String = value
}
