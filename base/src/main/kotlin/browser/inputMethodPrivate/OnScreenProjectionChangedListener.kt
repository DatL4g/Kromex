@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

/**
 * This event is sent when the screen is being mirrored or the desktop is being cast.
 */
public external interface OnScreenProjectionChangedListener {
  /**
   * Whether the screen is projected.
   */
  public var isProjected: Boolean
}
