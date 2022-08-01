@file:JsModule("webextension-polyfill")
@file:JsQualifier("contentSettings")

package browser.contentSettings

public external interface GetDetails {
  /**
   * The primary URL for which the content setting should be retrieved. Note that the meaning of a
   * primary URL depends on the content type.
   */
  public var primaryUrl: String

  /**
   * The secondary URL for which the content setting should be retrieved. Defaults to the primary
   * URL. Note that the meaning of a secondary URL depends on the content type, and not all content
   * types use secondary URLs.
   */
  public var secondaryUrl: String?

  /**
   * A more specific identifier of the type of content for which the settings should be retrieved.
   */
  public var resourceIdentifier: ResourceIdentifier?

  /**
   * Whether to check the content settings for an incognito session. (default false)
   */
  public var incognito: Boolean?
}
