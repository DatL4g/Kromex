@file:JsModule("webextension-polyfill")
@file:JsQualifier("extensionsManifestTypes")

package browser.extensionsManifestTypes

/**
 * The <code>content_capabilities</code> manifest entry allows an extension to grant certain
 * additional capabilities to web contents whose locations match a given set of URL patterns.
 */
public external interface ContentCapabilities {
  /**
   * The set of URL patterns to match against. If any of the given patterns match a URL, its
   * contents will be granted the specified capabilities.
   */
  public var matches: Array<String>

  /**
   * The set of capabilities to grant matched contents. This is currently limited to
   * <code>clipboardRead</code>, <code>clipboardWrite</code>, and <code>unlimitedStorage</code>.
   */
  public var permissions: Array<String>
}
