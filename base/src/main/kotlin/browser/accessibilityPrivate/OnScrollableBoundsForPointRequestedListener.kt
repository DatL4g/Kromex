@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityPrivate")

package browser.accessibilityPrivate

/**
 * Fired when an internal component within accessibility wants to find the nearest scrolling
 * container at a given screen coordinate. Used in Automatic Clicks.
 */
public external interface OnScrollableBoundsForPointRequestedListener {
  /**
   * X screen coordinate of the point.
   */
  public var x: Number

  /**
   * Y screen coordinate of the point.
   */
  public var y: Number
}
