@file:JsModule("webextension-polyfill")
@file:JsQualifier("guestViewInternal")

package browser.guestViewInternal

/**
 * Size parameters.
 */
public external interface SizeParams {
  public var enableAutoSize: Boolean?

  public var min: Size?

  public var max: Size?

  public var normal: Size?
}
