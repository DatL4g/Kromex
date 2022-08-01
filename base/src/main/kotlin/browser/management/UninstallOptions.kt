@file:JsModule("webextension-polyfill")
@file:JsQualifier("management")

package browser.management

/**
 * Options for how to handle the extension's uninstallation.
 */
public external interface UninstallOptions {
  /**
   * Whether or not a confirm-uninstall dialog should prompt the user. Defaults to false for self
   * uninstalls. If an extension uninstalls another extension, this parameter is ignored and the dialog
   * is always shown.
   */
  public var showConfirmDialog: Boolean?
}
