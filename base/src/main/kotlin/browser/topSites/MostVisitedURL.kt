@file:JsModule("webextension-polyfill")
@file:JsQualifier("topSites")

package browser.topSites

/**
 * An object encapsulating a most visited URL, such as the default shortcuts on the new tab page.
 */
public external interface MostVisitedURL {
  /**
   * The most visited URL.
   */
  public var url: String

  /**
   * The title of the page
   */
  public var title: String
}
