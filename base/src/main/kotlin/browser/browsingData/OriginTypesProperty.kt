@file:JsModule("webextension-polyfill")
@file:JsQualifier("browsingData")

package browser.browsingData

public external interface OriginTypesProperty {
  /**
   * Normal websites.
   */
  public var unprotectedWeb: Boolean?

  /**
   * Websites that have been installed as hosted applications (be careful!).
   */
  public var protectedWeb: Boolean?

  /**
   * Extensions and packaged applications a user has installed (be _really_ careful!).
   */
  public var extension: Boolean?
}
