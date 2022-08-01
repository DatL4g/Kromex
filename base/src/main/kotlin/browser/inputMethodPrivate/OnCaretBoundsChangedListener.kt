@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

/**
 * Fired when the caret bounds change.
 */
public external interface OnCaretBoundsChangedListener {
  /**
   * The bounds information for the caret.
   */
  public var caretBounds: CaretBoundsProperty
}
