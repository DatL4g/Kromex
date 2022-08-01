@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

/**
 * Properties of the assistive window.
 */
public external interface AssistiveWindowProperties {
  public var type: AssistiveWindowType

  /**
   * Sets true to show AssistiveWindow, sets false to hide.
   */
  public var visible: Boolean

  /**
   * Strings for ChromeVox to announce.
   */
  public var announceString: String?
}
