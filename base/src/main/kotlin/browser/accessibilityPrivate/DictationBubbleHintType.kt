package browser.accessibilityPrivate

import kotlin.String

/**
 * Types of hints displayed in the Dictation bubble UI.
 */
public enum class DictationBubbleHintType(
  private val `value`: String,
) {
  trySaying("trySaying"),
  type("type"),
  delete("delete"),
  selectAll("selectAll"),
  undo("undo"),
  help("help"),
  unselect("unselect"),
  copy("copy"),
  ;

  public override fun toString(): String = value
}
