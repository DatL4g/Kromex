@file:JsModule("webextension-polyfill")
@file:JsQualifier("browserAction")

package browser.browserAction

public external interface SetIconDetails {
  /**
   * Either an ImageData object or a dictionary {size -> ImageData} representing an icon to be set.
   * If the icon is specified as a dictionary, the image used is chosen depending on the screen's pixel
   * density. If the number of image pixels that fit into one screen space unit equals
   * <code>scale</code>, then an image with size <code>scale</code> * n is selected, where <i>n</i> is
   * the size of the icon in the UI. At least one image must be specified. Note that 'details.imageData
   * = foo' is equivalent to 'details.imageData = {'16': foo}'
   */
  public var imageData: Any

  /**
   * Either a relative image path or a dictionary {size -> relative image path} pointing to an icon
   * to be set. If the icon is specified as a dictionary, the image used is chosen depending on the
   * screen's pixel density. If the number of image pixels that fit into one screen space unit equals
   * <code>scale</code>, then an image with size <code>scale</code> * n is selected, where <i>n</i> is
   * the size of the icon in the UI. At least one image must be specified. Note that 'details.path =
   * foo' is equivalent to 'details.path = {'16': foo}'
   */
  public var path: Any

  /**
   * Limits the change to when a particular tab is selected. Automatically resets when the tab is
   * closed.
   */
  public var tabId: Int?
}
