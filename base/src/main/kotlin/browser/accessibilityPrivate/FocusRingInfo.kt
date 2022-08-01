@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityPrivate")

package browser.accessibilityPrivate

public external interface FocusRingInfo {
  /**
   * Array of rectangles to draw the accessibility focus ring around.
   */
  public var rects: Array<ScreenRect>

  /**
   * The FocusType for the ring.
   */
  public var type: FocusType

  /**
   * A RGB hex-value color string (e.g. #3F8213) that describes the primary color of the focus ring.
   */
  public var color: String

  /**
   * A RGB hex-value color string (e.g. #3F82E4) that describes the secondary color of the focus
   * ring, if there is one.
   */
  public var secondaryColor: String?

  /**
   * A RGB hex-value color string (e.g. #803F82E4) that describes the color drawn outside of the
   * focus ring and over the rest of the display.
   */
  public var backgroundColor: String?

  /**
   * The FocusType for the ring.
   */
  public var stackingOrder: FocusRingStackingOrder?

  /**
   * An identifier for this focus ring, unique within the extension.
   */
  public var id: String?
}
