@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

/**
 * Fired when the composition bounds or cursor bounds are changed.
 */
public external interface OnCompositionBoundsChangedListener {
  /**
   * The bounds information for the first character in composition.
   */
  public var firstBounds: FirstBoundsProperty

  /**
   * List of bounds information.
   */
  public var boundsList: Array<BoundsListProperty>
}
