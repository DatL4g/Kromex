@file:JsModule("webextension-polyfill")
@file:JsQualifier("contentSettings")

package browser.contentSettings

/**
 * The only content type using resource identifiers is $(ref:contentSettings.plugins). For more
 * information, see <a href="contentSettings#resource-identifiers">Resource Identifiers</a>.
 */
public external interface ResourceIdentifier {
  /**
   * The resource identifier for the given content type.
   */
  public var id: String

  /**
   * A human readable description of the resource.
   */
  public var description: String?
}
