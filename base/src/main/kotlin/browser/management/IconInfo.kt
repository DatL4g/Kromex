@file:JsModule("webextension-polyfill")
@file:JsQualifier("management")

package browser.management

/**
 * Information about an icon belonging to an extension, app, or theme.
 */
public external interface IconInfo {
  /**
   * A number representing the width and height of the icon. Likely values include (but are not
   * limited to) 128, 48, 24, and 16.
   */
  public var size: Int

  /**
   * The URL for this icon image. To display a grayscale version of the icon (to indicate that an
   * extension is disabled, for example), append <code>?grayscale=true</code> to the URL.
   */
  public var url: String
}
