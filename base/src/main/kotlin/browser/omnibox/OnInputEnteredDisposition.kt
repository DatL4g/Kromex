package browser.omnibox

import kotlin.String

/**
 * The window disposition for the omnibox query. This is the recommended context to display results.
 * For example, if the omnibox command is to navigate to a certain URL, a disposition of
 * 'newForegroundTab' means the navigation should take place in a new selected tab.
 */
public enum class OnInputEnteredDisposition(
  private val `value`: String,
) {
  currentTab("currentTab"),
  newForegroundTab("newForegroundTab"),
  newBackgroundTab("newBackgroundTab"),
  ;

  public override fun toString(): String = value
}
