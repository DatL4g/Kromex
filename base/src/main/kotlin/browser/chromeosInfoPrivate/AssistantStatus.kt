package browser.chromeosInfoPrivate

import kotlin.String

/**
 * Status of Google Assistant.
 */
public enum class AssistantStatus(
  private val `value`: String,
) {
  unsupported("unsupported"),
  supported("supported"),
  ;

  public override fun toString(): String = value
}
