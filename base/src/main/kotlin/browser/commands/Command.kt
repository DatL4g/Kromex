@file:JsModule("webextension-polyfill")
@file:JsQualifier("commands")

package browser.commands

public external interface Command {
  /**
   * The name of the Extension Command
   */
  public var name: String?

  /**
   * The Extension Command description
   */
  public var description: String?

  /**
   * The shortcut active for this command, or blank if not active.
   */
  public var shortcut: String?
}
