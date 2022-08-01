@file:JsModule("webextension-polyfill")
@file:JsQualifier("history")

package browser.history

/**
 * An object encapsulating one visit to a URL.
 */
public external interface VisitItem {
  /**
   * The unique identifier for the item.
   */
  public var id: String

  /**
   * The unique identifier for this visit.
   */
  public var visitId: String

  /**
   * When this visit occurred, represented in milliseconds since the epoch.
   */
  public var visitTime: Number?

  /**
   * The visit ID of the referrer.
   */
  public var referringVisitId: String

  /**
   * The <a href='#transition_types'>transition type</a> for this visit from its referrer.
   */
  public var transition: TransitionType
}
