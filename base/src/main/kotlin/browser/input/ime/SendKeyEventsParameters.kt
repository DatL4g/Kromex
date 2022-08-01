@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

public external interface SendKeyEventsParameters {
  /**
   * ID of the context where the key events will be sent, or zero to send key events to non-input
   * field.
   */
  public var contextID: Int

  /**
   * Data on the key event.
   */
  public var keyData: Array<KeyboardEvent>
}
