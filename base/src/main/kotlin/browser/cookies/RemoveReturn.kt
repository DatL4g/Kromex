@file:JsModule("webextension-polyfill")
@file:JsQualifier("cookies")

package browser.cookies

/**
 * Contains details about the cookie that's been removed.  If removal failed for any reason, this
 * will be "null", and $(ref:runtime.lastError) will be set.
 */
public external interface RemoveReturn {
  /**
   * The URL associated with the cookie that's been removed.
   */
  public var url: String

  /**
   * The name of the cookie that's been removed.
   */
  public var name: String

  /**
   * The ID of the cookie store from which the cookie was removed.
   */
  public var storeId: String
}
