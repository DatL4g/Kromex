@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

public external interface ReloadReloadProperties {
  /**
   * Whether to bypass local caching. Defaults to <code>false</code>.
   */
  public var bypassCache: Boolean?
}
