@file:JsModule("webextension-polyfill")
@file:JsQualifier("omnibox")

package browser.omnibox

/**
 * User has deleted a suggested result.
 */
public external interface OnDeleteSuggestionListener {
  /**
   * Text of the deleted suggestion.
   */
  public var text: String
}
