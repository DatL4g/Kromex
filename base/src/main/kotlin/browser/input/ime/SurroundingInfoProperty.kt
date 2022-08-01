@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

public external interface SurroundingInfoProperty {
  /**
   * The text around the cursor. This is only a subset of all text in the input field.
   */
  public var text: String

  /**
   * The ending position of the selection. This value indicates caret position if there is no
   * selection.
   */
  public var focus: Int

  /**
   * The beginning position of the selection. This value indicates caret position if there is no
   * selection.
   */
  public var anchor: Int

  /**
   * The offset position of <code>text</code>. Since <code>text</code> only includes a subset of
   * text around the cursor, offset indicates the absolute position of the first character of
   * <code>text</code>.
   */
  public var offset: Int
}
