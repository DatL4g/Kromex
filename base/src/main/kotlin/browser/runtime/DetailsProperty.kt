@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime

public external interface DetailsProperty {
  /**
   * The version number of the available update.
   */
  public var version: String
}
