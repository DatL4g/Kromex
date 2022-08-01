@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

public external interface SetAssistiveWindowButtonHighlightedParameters {
  /**
   * ID of the context owning the assistive window.
   */
  public var contextID: Int

  /**
   * The ID of the button
   */
  public var buttonID: AssistiveWindowButton

  /**
   * The window type the button belongs to.
   */
  public var windowType: AssistiveWindowType

  /**
   * The text for the screenreader to announce.
   */
  public var announceString: String?

  /**
   * Whether the button should be highlighted.
   */
  public var highlighted: Boolean
}
