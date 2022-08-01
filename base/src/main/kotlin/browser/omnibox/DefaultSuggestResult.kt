@file:JsModule("webextension-polyfill")
@file:JsQualifier("omnibox")

package browser.omnibox

/**
 * A suggest result.
 */
public external interface DefaultSuggestResult {
  /**
   * The text that is displayed in the URL dropdown. Can contain XML-style markup for styling. The
   * supported tags are 'url' (for a literal URL), 'match' (for highlighting text that matched what the
   * user's query), and 'dim' (for dim helper text). The styles can be nested, eg. <dim><match>dimmed
   * match</match></dim>.
   */
  public var description: String

  /**
   * An array of style ranges for the description, as provided by the extension.
   */
  public var descriptionStyles: Array<MatchClassification>?
}
