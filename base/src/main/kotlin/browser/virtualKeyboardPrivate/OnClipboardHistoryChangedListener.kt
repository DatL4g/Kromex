@file:JsModule("webextension-polyfill")
@file:JsQualifier("virtualKeyboardPrivate")

package browser.virtualKeyboardPrivate

/**
 * Fired when the list of items in the clipboard history changes.
 */
public external interface OnClipboardHistoryChangedListener {
  /**
   * A list of ids for all current items in the clipboard history.
   */
  public var itemIds: Array<String>
}
