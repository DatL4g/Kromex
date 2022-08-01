@file:JsModule("webextension-polyfill")
@file:JsQualifier("omnibox")

package browser.omnibox

/**
 * The style ranges for the description, as provided by the extension.
 */
public external interface MatchClassification {
  public var offset: Int

  /**
   * The style type
   */
  public var type: DescriptionStyleType

  public var length: Int?
}
