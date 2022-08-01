@file:JsModule("webextension-polyfill")
@file:JsQualifier("virtualKeyboardPrivate")

package browser.virtualKeyboardPrivate

public external interface ContainerBehaviorOptions {
  /**
   * The value of the virtual keyboard mode to set to.
   */
  public var mode: KeyboardMode

  /**
   * The bounds of the virtual keyboard after changing mode
   */
  public var bounds: Bounds
}
