@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

/**
 * This event is sent when a button in an assistive window is clicked.
 */
public external interface OnAssistiveWindowButtonClickedListener {
  public var details: DetailsProperty
}
