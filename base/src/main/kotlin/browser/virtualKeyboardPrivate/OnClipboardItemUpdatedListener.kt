@file:JsModule("webextension-polyfill")
@file:JsQualifier("virtualKeyboardPrivate")

package browser.virtualKeyboardPrivate

/**
 * Fired when the data in a specific clipboard item is updated (mainly used for sending updated
 * rendered html image).
 */
public external interface OnClipboardItemUpdatedListener {
  /**
   * An existing clipboard history item with changed data
   */
  public var clipboardHistoryItem: ClipboardItem
}
