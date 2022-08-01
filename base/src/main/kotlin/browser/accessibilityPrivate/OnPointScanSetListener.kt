@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityPrivate")

package browser.accessibilityPrivate

/**
 * Fired when Chrome OS has received the final point of point scanning.
 */
public external interface OnPointScanSetListener {
  public var point: PointScanPoint
}
