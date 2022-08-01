@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

public external interface ChangeInfoProperty {
  /**
   * The tab's loading status.
   */
  public var status: TabStatus?

  /**
   * The tab's URL if it has changed.
   */
  public var url: String?

  /**
   * The tab's new group.
   */
  public var groupId: Int?

  /**
   * The tab's new pinned state.
   */
  public var pinned: Boolean?

  /**
   * The tab's new audible state.
   */
  public var audible: Boolean?

  /**
   * The tab's new discarded state.
   */
  public var discarded: Boolean?

  /**
   * The tab's new auto-discardable state.
   */
  public var autoDiscardable: Boolean?

  /**
   * The tab's new muted state and the reason for the change.
   */
  public var mutedInfo: MutedInfo?

  /**
   * The tab's new favicon URL.
   */
  public var favIconUrl: String?

  /**
   * The tab's new title.
   */
  public var title: String?
}
