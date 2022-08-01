@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

/**
 * This event is sent when a new set of suggestions has been generated
 */
public external interface OnSuggestionsChangedListener {
  /**
   * List of suggestions to display, in order of relevance
   */
  public var suggestions: Array<String>
}
