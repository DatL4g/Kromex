@file:JsModule("webextension-polyfill")
@file:JsQualifier("webstorePrivate")

package browser.webstorePrivate

public external interface BeginInstallWithManifest3Details {
  /**
   * The id of the extension to be installed.
   */
  public var id: String

  /**
   * A string with the contents of the extension's manifest.json file. During the install process,
   * the browser will check that the downloaded extension's manifest matches what was passed in here.
   */
  public var manifest: String

  public var iconUrl: String?

  /**
   * A string to use instead of the raw value of the 'name' key from manifest.json.
   */
  public var localizedName: String?

  /**
   * The name of the locale used for generating localizedName. This should be the name of one of the
   * directories in the _locales folder of the extension, or the default_locale setting from the
   * manifest.
   */
  public var locale: String?

  /**
   * A flag to change the UI we show when an app is installed - a value of true means to show a
   * bubble pointing at the new tab button (instead of the default behavior of opening the new tab page
   * and animating the app icon).
   */
  public var appInstallBubble: Boolean?

  /**
   * A flag to cause the app launcher to be installed before installing the extension, if it isn't
   * installed already.
   */
  public var enableLauncher: Boolean?

  /**
   * The authuser index to be included with CRX download requests in multi-login sessions.
   */
  public var authuser: String?

  /**
   * A flag to specify if the extension is included in the ESB allowlist.
   */
  public var esbAllowlist: Boolean?
}
