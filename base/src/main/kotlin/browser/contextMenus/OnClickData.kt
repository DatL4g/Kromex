@file:JsModule("webextension-polyfill")
@file:JsQualifier("contextMenus")

package browser.contextMenus

/**
 * Information sent when a context menu item is clicked.
 */
public external interface OnClickData {
  /**
   * The ID of the menu item that was clicked.
   */
  public var menuItemId: Any

  /**
   * The parent ID, if any, for the item clicked.
   */
  public var parentMenuItemId: Any

  /**
   * One of 'image', 'video', or 'audio' if the context menu was activated on one of these types of
   * elements.
   */
  public var mediaType: String?

  /**
   * If the element is a link, the URL it points to.
   */
  public var linkUrl: String?

  /**
   * Will be present for elements with a 'src' URL.
   */
  public var srcUrl: String?

  /**
   * The URL of the page where the menu item was clicked. This property is not set if the click
   * occured in a context where there is no current page, such as in a launcher context menu.
   */
  public var pageUrl: String?

  /**
   *  The URL of the frame of the element where the context menu was clicked, if it was in a frame.
   */
  public var frameUrl: String?

  /**
   *  The <a href='webNavigation#frame_ids'>ID of the frame</a> of the element where the context
   * menu was clicked, if it was in a frame.
   */
  public var frameId: Int?

  /**
   * The text for the context selection, if any.
   */
  public var selectionText: String?

  /**
   * A flag indicating whether the element is editable (text input, textarea, etc.).
   */
  public var editable: Boolean

  /**
   * A flag indicating the state of a checkbox or radio item before it was clicked.
   */
  public var wasChecked: Boolean?

  /**
   * A flag indicating the state of a checkbox or radio item after it is clicked.
   */
  public var checked: Boolean?
}
