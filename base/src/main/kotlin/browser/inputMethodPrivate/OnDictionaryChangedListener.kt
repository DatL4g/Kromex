@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

/**
 * Fired when words are added or removed from the custom spelling dictionary.
 */
public external interface OnDictionaryChangedListener {
  /**
   * List of added words.
   */
  public var added: Array<String>

  /**
   * List of removed words.
   */
  public var removed: Array<String>
}
