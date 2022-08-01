package browser.webViewInternal

import kotlin.String

/**
 * Determines what to do with the active match after the find session has ended. 'clear' will clear
 * the highlighting over the active match; 'keep' will keep the active match highlighted; 'activate'
 * will keep the active match highlighted and simulate a user click on that match.
 */
public enum class StopFindingAction(
  private val `value`: String,
) {
  clear("clear"),
  keep("keep"),
  activate("activate"),
  ;

  public override fun toString(): String = value
}
