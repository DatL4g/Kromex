@file:JsModule("webextension-polyfill")
@file:JsQualifier("extensionTypes")

package browser.extensionTypes

/**
 * Details of the CSS to remove. Either the code or the file property must be set, but both may not
 * be set at the same time.
 */
public external interface DeleteInjectionDetails {
  /**
   * CSS code to remove.
   */
  public var code: String?

  /**
   * CSS file to remove.
   */
  public var `file`: String?

  /**
   * If allFrames is <code>true</code>, implies that the CSS should be removed from all frames of
   * current page. By default, it's <code>false</code> and is only removed from the top frame. If
   * <code>true</code> and <code>frameId</code> is set, then the code is removed from the selected
   * frame and all of its child frames.
   */
  public var allFrames: Boolean?

  /**
   * The <a href='webNavigation#frame_ids'>frame</a> from where the CSS should be removed. Defaults
   * to 0 (the top-level frame).
   */
  public var frameId: Int?

  /**
   * If matchAboutBlank is true, then the code is also removed from about:blank and about:srcdoc
   * frames if your extension has access to its parent document. By default it is <code>false</code>.
   */
  public var matchAboutBlank: Boolean?

  /**
   * The <a href="https://www.w3.org/TR/css3-cascade/#cascading-origins">origin</a> of the CSS to
   * remove. Defaults to <code>"author"</code>.
   */
  public var cssOrigin: CSSOrigin?
}
