@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Details of the script or CSS to inject. Either the code or the file property must be set, but
 * both may not be set at the same time.
 */
public external interface InjectDetails {
  /**
   * JavaScript or CSS code to inject.<br><br><b>Warning:</b><br>Be careful using the
   * <code>code</code> parameter. Incorrect use of it may open your app to <a
   * href="https://en.wikipedia.org/wiki/Cross-site_scripting">cross site scripting</a> attacks.
   */
  public var code: String?

  /**
   * JavaScript or CSS file to inject.
   */
  public var `file`: String?
}
