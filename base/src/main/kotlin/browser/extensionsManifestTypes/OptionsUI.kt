@file:JsModule("webextension-polyfill")
@file:JsQualifier("extensionsManifestTypes")

package browser.extensionsManifestTypes

/**
 * The <code>options_ui</code> manifest property declares how the options page should be displayed.
 */
public external interface OptionsUI {
  /**
   * The path to your options page, relative to your extension's root.
   */
  public var page: String

  /**
   * If <code>true</code>, a Chrome user agent stylesheet will be applied to your options page. The
   * default value is <code>false</code>. We do not recommend you enable it as it no longer results in
   * a consistent UI with Chrome. This option will be removed in Manifest V3.
   */
  public var chrome_style: Boolean?

  /**
   * <p>If <code>true</code>, your extension's options page will be opened in a new tab rather than
   * embedded in <em>chrome://extensions</em>. The default is <code>false</code>, and we recommend that
   * you don't change it.</p><p><strong>This is only useful to delay the inevitable deprecation of the
   * old options UI!</strong> It will be removed soon, so try not to use it. It will break.</p>
   */
  public var open_in_tab: Boolean?
}
