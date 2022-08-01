@file:JsModule("webextension-polyfill")
@file:JsQualifier("echoPrivate")

package browser.echoPrivate

/**
 * Information about the service requesting user consent.
 */
public external interface GetUserConsentConsentRequester {
  /**
   * User friendly name of the service that is requesting the consent.
   */
  public var serviceName: String

  /**
   * URL origin of the service requesting the consent.
   */
  public var origin: String

  /**
   * The ID of the tab from which the user consent was requested. The tab ID is used to determine
   * with which tab to associate the user consent request dialog. If the user consent was requested
   * from an app window, the tab ID should not be set.
   */
  public var tabId: Int?
}
