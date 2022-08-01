@file:JsModule("webextension-polyfill")
@file:JsQualifier("instanceID")

package browser.instanceID

/**
 * Parameters for getToken.
 */
public external interface GetTokenGetTokenParams {
  /**
   * Identifies the entity that is authorized to access resources associated with this Instance ID.
   * It can be a project ID from <a href='https://code.google.com/apis/console'>Google developer
   * console</a>.
   */
  public var authorizedEntity: String

  /**
   * Identifies authorized actions that the authorized entity can take. E.g. for sending GCM
   * messages, <code>GCM</code> scope should be used.
   */
  public var scope: String

  /**
   * Allows including a small number of string key/value pairs that will be associated with the
   * token and may be used in processing the request.
   */
  @Deprecated(
    message = "options are deprecated and will be ignored.",
    level = DeprecationLevel.WARNING,
  )
  public var options: String?
}
