@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

public external interface SegmentsProperty {
  /**
   * Index of the character to start this segment at
   */
  public var start: Int

  /**
   * Index of the character to end this segment after.
   */
  public var end: Int

  /**
   * The type of the underline to modify this segment.
   */
  public var style: UnderlineStyle
}
