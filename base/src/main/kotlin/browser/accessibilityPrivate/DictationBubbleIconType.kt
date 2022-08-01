package browser.accessibilityPrivate

import kotlin.String

/**
 * The icon shown in the Dictation bubble UI.
 */
public enum class DictationBubbleIconType(
  private val `value`: String,
) {
  hidden("hidden"),
  standby("standby"),
  macroSuccess("macroSuccess"),
  macroFail("macroFail"),
  ;

  public override fun toString(): String = value
}
