@file:JsModule("webextension-polyfill")
@file:JsQualifier("virtualKeyboardPrivate")

package browser.virtualKeyboardPrivate

public external interface GetClipboardHistoryOptions {
  /**
   * A filter represented as a list of clipboard item ids. getClipboardHistory will only return the
   * items in this list. If this list is empty, getClipboardHistory will return all clipboard items in
   * the history.
   */
  public var itemIds: Array<String>?
}
