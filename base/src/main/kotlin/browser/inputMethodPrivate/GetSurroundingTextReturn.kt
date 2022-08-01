@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

/**
 * The surrouding text info.
 */
public external interface GetSurroundingTextReturn {
  public var before: String

  public var selected: String

  public var after: String
}
