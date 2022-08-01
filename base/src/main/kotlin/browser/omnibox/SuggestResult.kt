@file:JsModule("webextension-polyfill")
@file:JsQualifier("omnibox")

package browser.omnibox

/**
 * A suggest result.
 */
public external interface SuggestResult {
  /**
   * The text that is put into the URL bar, and that is sent to the extension when the user chooses
   * this entry.
   */
  public var content: String

  /**
   * The text that is displayed in the URL dropdown. Can contain XML-style markup for styling. The
   * supported tags are 'url' (for a literal URL), 'match' (for highlighting text that matched what the
   * user's query), and 'dim' (for dim helper text). The styles can be nested, eg. <dim><match>dimmed
   * match</match></dim>. You must escape the five predefined entities to display them as text:
   * stackoverflow.com/a/1091953/89484 
   */
  public var description: String

  /**
   * Whether the suggest result can be deleted by the user.
   */
  public var deletable: Boolean?

  /**
   * An array of style ranges for the description, as provided by the extension.
   */
  public var descriptionStyles: Array<MatchClassification>?
}
