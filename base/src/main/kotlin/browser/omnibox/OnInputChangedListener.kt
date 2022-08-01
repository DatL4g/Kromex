@file:JsModule("webextension-polyfill")
@file:JsQualifier("omnibox")

package browser.omnibox

/**
 * User has changed what is typed into the omnibox.
 */
public external interface OnInputChangedListener {
  public var text: String

  /**
   * A callback passed to the onInputChanged event used for sending suggestions back to the browser.
   *
   * @param suggestResults Array of suggest results
   */
  public fun suggest(suggestResults: Array<SuggestResult>): Nothing
}
