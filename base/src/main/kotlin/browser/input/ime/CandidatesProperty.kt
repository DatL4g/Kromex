@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

public external interface CandidatesProperty {
  /**
   * The candidate
   */
  public var candidate: String

  /**
   * The candidate's id
   */
  public var id: Int

  /**
   * The id to add these candidates under
   */
  public var parentId: Int?

  /**
   * Short string displayed to next to the candidate, often the shortcut key or index
   */
  public var label: String?

  /**
   * Additional text describing the candidate
   */
  public var `annotation`: String?

  /**
   * The usage or detail description of word.
   */
  public var usage: UsageProperty?
}
