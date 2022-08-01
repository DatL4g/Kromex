@file:JsModule("webextension-polyfill")
@file:JsQualifier("extensionTypes")

package browser.extensionTypes

/**
 * Details of the script or CSS to inject. Either the code or the file property must be set, but
 * both may not be set at the same time.
 */
public external interface InjectDetails {
  /**
   * JavaScript or CSS code to inject.<br><br><b>Warning:</b><br>Be careful using the
   * <code>code</code> parameter. Incorrect use of it may open your extension to <a
   * href="https://en.wikipedia.org/wiki/Cross-site_scripting">cross site scripting</a> attacks.
   */
  public var code: String?

  /**
   * JavaScript or CSS file to inject.
   */
  public var `file`: String?

  /**
   * If allFrames is <code>true</code>, implies that the JavaScript or CSS should be injected into
   * all frames of current page. By default, it's <code>false</code> and is only injected into the top
   * frame. If <code>true</code> and <code>frameId</code> is set, then the code is inserted in the
   * selected frame and all of its child frames.
   */
  public var allFrames: Boolean?

  /**
   * The <a href='webNavigation#frame_ids'>frame</a> where the script or CSS should be injected.
   * Defaults to 0 (the top-level frame).
   */
  public var frameId: Int?

  /**
   * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc
   * frames if your extension has access to its parent document. Code cannot be inserted in top-level
   * about:-frames. By default it is <code>false</code>.
   */
  public var matchAboutBlank: Boolean?

  /**
   * The soonest that the JavaScript or CSS will be injected into the tab. Defaults to
   * "document_idle".
   */
  public var runAt: RunAt?

  /**
   * The <a href="https://www.w3.org/TR/css3-cascade/#cascading-origins">origin</a> of the CSS to
   * inject. This may only be specified for CSS, not JavaScript. Defaults to <code>"author"</code>.
   */
  public var cssOrigin: CSSOrigin?
}
