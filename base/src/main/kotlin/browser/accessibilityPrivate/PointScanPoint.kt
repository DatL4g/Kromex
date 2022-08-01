@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityPrivate")

package browser.accessibilityPrivate

public external interface PointScanPoint {
  /**
   * X coordinate of the selected point in DIPs.
   */
  public var x: Number

  /**
   * Y coordinate of the selected point in DIPs.
   */
  public var y: Number
}
