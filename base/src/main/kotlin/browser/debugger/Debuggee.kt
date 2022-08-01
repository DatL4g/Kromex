@file:JsModule("webextension-polyfill")
@file:JsQualifier("debugger")

package browser.debugger

/**
 * Debuggee identifier. Either tabId or extensionId must be specified
 */
public external interface Debuggee {
  /**
   * The id of the tab which you intend to debug.
   */
  public var tabId: Int?

  /**
   * The id of the extension which you intend to debug. Attaching to an extension background page is
   * only possible when the <code>--silent-debugger-extension-api</code> command-line switch is used.
   */
  public var extensionId: String?

  /**
   * The opaque id of the debug target.
   */
  public var targetId: String?
}
