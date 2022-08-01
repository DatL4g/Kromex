@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityPrivate")

package browser.accessibilityPrivate

/**
 * Fired when an action is performed in the Select-to-speak panel.
 */
public external interface OnSelectToSpeakPanelActionListener {
  public var action: SelectToSpeakPanelAction

  public var `value`: Number?
}
