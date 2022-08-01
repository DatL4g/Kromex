package browser.extensionTypes

import kotlin.String

/**
 * The soonest that the JavaScript or CSS will be injected into the tab.
 */
public enum class RunAt(
  private val `value`: String,
) {
  document_start("document_start"),
  document_end("document_end"),
  document_idle("document_idle"),
  ;

  public override fun toString(): String = value
}
