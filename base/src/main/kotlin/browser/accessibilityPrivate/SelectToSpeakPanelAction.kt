package browser.accessibilityPrivate

import kotlin.String

/**
 * Actions that can be performed in the Select-to-speak panel.
 */
public enum class SelectToSpeakPanelAction(
  private val `value`: String,
) {
  previousParagraph("previousParagraph"),
  previousSentence("previousSentence"),
  pause("pause"),
  resume("resume"),
  nextSentence("nextSentence"),
  nextParagraph("nextParagraph"),
  exit("exit"),
  changeSpeed("changeSpeed"),
  ;

  public override fun toString(): String = value
}
