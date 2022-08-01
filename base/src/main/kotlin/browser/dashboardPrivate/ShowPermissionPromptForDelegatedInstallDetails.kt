@file:JsModule("webextension-polyfill")
@file:JsQualifier("dashboardPrivate")

package browser.dashboardPrivate

public external interface ShowPermissionPromptForDelegatedInstallDetails {
  /**
   * The id of the extension to be installled.
   */
  public var id: String

  /**
   * A string with the contents of the extension's manifest.json file. During the install process,
   * the browser will check that the downloaded extension's manifest matches what was passed in here.
   */
  public var manifest: String

  /**
   * The display name of the user for whom the extension should be installed.
   */
  public var delegatedUser: String

  public var iconUrl: String?

  /**
   * A string to use instead of the raw value of the 'name' key from manifest.json.
   */
  public var localizedName: String?
}
