@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

public external interface PropertiesProperty {
  /**
   * True to show the Candidate window, false to hide it.
   */
  public var visible: Boolean?

  /**
   * True to show the cursor, false to hide it.
   */
  public var cursorVisible: Boolean?

  /**
   * True if the candidate window should be rendered vertical, false to make it horizontal.
   */
  public var vertical: Boolean?

  /**
   * The number of candidates to display per page.
   */
  public var pageSize: Int?

  /**
   * Text that is shown at the bottom of the candidate window.
   */
  public var auxiliaryText: String?

  /**
   * True to display the auxiliary text, false to hide it.
   */
  public var auxiliaryTextVisible: Boolean?

  /**
   * The total number of candidates for the candidate window.
   */
  public var totalCandidates: Int?

  /**
   * The index of the current chosen candidate out of total candidates.
   */
  public var currentCandidateIndex: Int?

  /**
   * Where to display the candidate window.
   */
  public var windowPosition: WindowPosition?
}
