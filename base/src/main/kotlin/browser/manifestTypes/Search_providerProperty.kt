@file:JsModule("webextension-polyfill")
@file:JsQualifier("manifestTypes")

package browser.manifestTypes

public external interface Search_providerProperty {
  /**
   * Name of the search engine displayed to user. This may only be omitted if
   * <em>prepopulated_id</em> is set.
   */
  public var name: String?

  /**
   * Omnibox keyword for the search engine. This may only be omitted if <em>prepopulated_id</em> is
   * set.
   */
  public var keyword: String?

  /**
   * An icon URL for the search engine. This may only be omitted if <em>prepopulated_id</em> is set.
   */
  public var favicon_url: String?

  /**
   * An search URL used by the search engine.
   */
  public var search_url: String

  /**
   * Encoding of the search term. This may only be omitted if <em>prepopulated_id</em> is set.
   */
  public var encoding: String?

  /**
   * If omitted, this engine does not support suggestions.
   */
  public var suggest_url: String?

  /**
   * If omitted, this engine does not support image search.
   */
  public var image_url: String?

  /**
   * The string of post parameters to search_url
   */
  public var search_url_post_params: String?

  /**
   * The string of post parameters to suggest_url
   */
  public var suggest_url_post_params: String?

  /**
   * The string of post parameters to image_url
   */
  public var image_url_post_params: String?

  /**
   * A list of URL patterns that can be used, in addition to |search_url|.
   */
  public var alternate_urls: Array<String>?

  /**
   * An ID of the built-in search engine in Chrome.
   */
  public var prepopulated_id: Int?

  /**
   * Specifies if the search provider should be default.
   */
  public var is_default: Boolean
}
