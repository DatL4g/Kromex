@file:JsModule("webextension-polyfill")
@file:JsQualifier("manifestTypes")

package browser.manifestTypes

/**
 * Chrome settings which can be overriden by an extension.
 */
public external interface ChromeSettingsOverrides {
  /**
   * New value for the homepage.
   */
  public var homepage: String?

  /**
   * A search engine
   */
  public var search_provider: Search_providerProperty?

  /**
   * An array of length one containing a URL to be used as the startup page.
   */
  public var startup_pages: Array<String>?
}
