@file:JsModule("webextension-polyfill")
@file:JsQualifier("types")

package browser.types

/**
 * Which setting to consider.
 */
public external interface GetDetails {
  /**
   * Whether to return the value that applies to the incognito session (default false).
   */
  public var incognito: Boolean?
}
