@file:JsModule("webextension-polyfill")
@file:JsQualifier("pageAction")

package browser.pageAction

public external interface SetIconDetails {
  /**
   * The id of the tab for which you want to modify the page action.
   */
  public var tabId: Int

  /**
   * Either an ImageData object or a dictionary {size -> ImageData} representing icon to be set. If
   * the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's
   * pixel density. If the number of image pixels that fit into one screen space unit equals
   * <code>scale</code>, then image with size <code>scale</code> * n will be selected, where n is the
   * size of the icon in the UI. At least one image must be specified. Note that 'details.imageData =
   * foo' is equivalent to 'details.imageData = {'16': foo}'
   */
  public var imageData: Any

  /**
   * Either a relative image path or a dictionary {size -> relative image path} pointing to icon to
   * be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending
   * on screen's pixel density. If the number of image pixels that fit into one screen space unit
   * equals <code>scale</code>, then image with size <code>scale</code> * n will be selected, where n
   * is the size of the icon in the UI. At least one image must be specified. Note that 'details.path =
   * foo' is equivalent to 'details.path = {'16': foo}'
   */
  public var path: Any

  /**
   * <b>Deprecated.</b> This argument is ignored.
   */
  public var iconIndex: Int?
}
