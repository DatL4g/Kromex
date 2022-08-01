@file:JsModule("webextension-polyfill")
@file:JsQualifier("debugger")

package browser.debugger

/**
 * Debug target information
 */
public external interface TargetInfo {
  /**
   * Target type.
   */
  public var type: TargetInfoType

  /**
   * Target id.
   */
  public var id: String

  /**
   * The tab id, defined if type == 'page'.
   */
  public var tabId: Int?

  /**
   * The extension id, defined if type = 'background_page'.
   */
  public var extensionId: String?

  /**
   * True if debugger is already attached.
   */
  public var attached: Boolean

  /**
   * Target page title.
   */
  public var title: String

  /**
   * Target URL.
   */
  public var url: String

  /**
   * Target favicon URL.
   */
  public var faviconUrl: String?
}
