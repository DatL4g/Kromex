package browser.accessibilityPrivate

import kotlin.String

/**
 * Response code for onNativeChromeVoxArcSupportResult
 */
public enum class SetNativeChromeVoxResponse(
  private val `value`: String,
) {
  success("success"),
  talkbackNotInstalled("talkbackNotInstalled"),
  windowNotFound("windowNotFound"),
  failure("failure"),
  needDeprecationConfirmation("needDeprecationConfirmation"),
  ;

  public override fun toString(): String = value
}
