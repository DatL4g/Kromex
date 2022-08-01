@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityPrivate")

package browser.accessibilityPrivate

public external interface DictationBubbleProperties {
  /**
   * Whether or not the UI should be visible.
   */
  public var visible: Boolean

  /**
   * The icon to show in the Dictation bubble UI.
   */
  public var icon: DictationBubbleIconType

  /**
   * The text to be displayed in the bubble UI. If `text` is undefined, the bubble will clear its
   * current text.
   */
  public var text: String?

  /**
   * Array of hints to show in the UI.
   */
  public var hints: Array<DictationBubbleHintType>?
}
