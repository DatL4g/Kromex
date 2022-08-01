@file:JsModule("webextension-polyfill")
@file:JsQualifier("instanceID")

package browser.instanceID

/**
 * Parameters for deleteToken.
 */
public external interface DeleteTokenDeleteTokenParams {
  /**
   * The authorized entity that is used to obtain the token.
   */
  public var authorizedEntity: String

  /**
   * The scope that is used to obtain the token.
   */
  public var scope: String
}
