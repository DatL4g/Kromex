@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

/**
 * The input method config object.
 */
public external interface GetInputMethodConfigReturn {
  public var isPhysicalKeyboardAutocorrectEnabled: Boolean

  public var isImeMenuActivated: Boolean
}
