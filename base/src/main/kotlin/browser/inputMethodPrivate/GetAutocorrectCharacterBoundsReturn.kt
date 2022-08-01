@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

public external interface GetAutocorrectCharacterBoundsReturn {
  /**
   * The x-coordinate of the autocorrected word's bounds in px.
   */
  public var x: Int

  /**
   * The y-coordinate of the autocorrected word's bounds in px.
   */
  public var y: Int

  /**
   * The width of the autocorrected word's bounds in px.
   */
  public var width: Int

  /**
   * The height of the autocorrected word's bounds in px.
   */
  public var height: Int
}
