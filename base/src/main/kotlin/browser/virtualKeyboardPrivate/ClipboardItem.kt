@file:JsModule("webextension-polyfill")
@file:JsQualifier("virtualKeyboardPrivate")

package browser.virtualKeyboardPrivate

public external interface ClipboardItem {
  /**
   * The unique id which identifies this clipboard item.
   */
  public var id: String

  /**
   * The image data associated with this item.
   */
  public var imageData: String?

  /**
   * The text data associated with this item.
   */
  public var textData: String?

  /**
   * The display format associated with this item.
   */
  public var displayFormat: DisplayFormat

  /**
   * The time that this item was added to the clipboard, in milliseconds since the epoch.
   */
  public var timeCopied: Number
}
