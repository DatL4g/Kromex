@file:JsModule("webextension-polyfill")
@file:JsQualifier("management")

package browser.management

/**
 * Information about an installed extension, app, or theme.
 */
public external interface ExtensionInfo {
  /**
   * The extension's unique identifier.
   */
  public var id: String

  /**
   * The name of this extension, app, or theme.
   */
  public var name: String

  /**
   * A short version of the name of this extension, app, or theme.
   */
  public var shortName: String

  /**
   * The description of this extension, app, or theme.
   */
  public var description: String

  /**
   * The <a href='manifest/version'>version</a> of this extension, app, or theme.
   */
  public var version: String

  /**
   * The <a href='manifest/version#version_name'>version name</a> of this extension, app, or theme
   * if the manifest specified one.
   */
  public var versionName: String?

  /**
   * Whether this extension can be disabled or uninstalled by the user.
   */
  public var mayDisable: Boolean

  /**
   * Whether this extension can be enabled by the user. This is only returned for extensions which
   * are not enabled.
   */
  public var mayEnable: Boolean?

  /**
   * Whether it is currently enabled or disabled.
   */
  public var enabled: Boolean

  /**
   * A reason the item is disabled.
   */
  public var disabledReason: ExtensionDisabledReason?

  /**
   * True if this is an app.
   */
  @Deprecated(
    message = "Please use ${'$'}(ref:management.ExtensionInfo.type).",
    level = DeprecationLevel.WARNING,
  )
  public var isApp: Boolean

  /**
   * The type of this extension, app, or theme.
   */
  public var type: ExtensionType

  /**
   * The launch url (only present for apps).
   */
  public var appLaunchUrl: String?

  /**
   * The URL of the homepage of this extension, app, or theme.
   */
  public var homepageUrl: String?

  /**
   * The update URL of this extension, app, or theme.
   */
  public var updateUrl: String?

  /**
   * Whether the extension, app, or theme declares that it supports offline.
   */
  public var offlineEnabled: Boolean

  /**
   * The url for the item's options page, if it has one.
   */
  public var optionsUrl: String

  /**
   * A list of icon information. Note that this just reflects what was declared in the manifest, and
   * the actual image at that url may be larger or smaller than what was declared, so you might
   * consider using explicit width and height attributes on img tags referencing these images. See the
   * <a href='manifest/icons'>manifest documentation on icons</a> for more details.
   */
  public var icons: Array<IconInfo>?

  /**
   * Returns a list of API based permissions.
   */
  public var permissions: Array<String>

  /**
   * Returns a list of host based permissions.
   */
  public var hostPermissions: Array<String>

  /**
   * How the extension was installed.
   */
  public var installType: ExtensionInstallType

  /**
   * The app launch type (only present for apps).
   */
  public var launchType: LaunchType?

  /**
   * The currently available launch types (only present for apps).
   */
  public var availableLaunchTypes: Array<LaunchType>?
}
