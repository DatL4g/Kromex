@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

import browser.extensionTypes.RunAt

/**
 * Details of the content script to inject. Refer to the <a
 * href='/extensions/content_scripts'>content scripts</a> documentation for more details.
 */
public external interface ContentScriptDetails {
  /**
   * The name of the content script to inject.
   */
  public var name: String

  /**
   * Specifies which pages this content script will be injected into.
   */
  public var matches: Array<String>

  /**
   * Excludes pages that this content script would otherwise be injected into.
   */
  public var exclude_matches: Array<String>?

  /**
   * Whether to insert the content script on about:blank and about:srcdoc. Content scripts will only
   * be injected on pages when their inherit URL is matched by one of the declared patterns in the
   * matches field. The inherit URL is the URL of the document that created the frame or window.
   * Content scripts cannot be inserted in sandboxed frames.
   */
  public var match_about_blank: Boolean?

  /**
   * The CSS code or a list of CSS files to be injected into matching pages. These are injected in
   * the order they appear, before any DOM is constructed or displayed for the page.
   */
  public var css: InjectionItems?

  /**
   * The JavaScript code or a list of JavaScript files to be injected into matching pages. These are
   * injected in the order they appear.
   */
  public var js: InjectionItems?

  /**
   * The soonest that the JavaScript or CSS will be injected into the tab. Defaults to
   * "document_idle".
   */
  public var run_at: RunAt?

  /**
   * If <code>all_frames</code> is <code>true</code>, this implies that the JavaScript or CSS should
   * be injected into all frames of current page. By default, <code>all_frames</code> is
   * <code>false</code> and the JavaScript or CSS is only injected into the top frame.
   */
  public var all_frames: Boolean?

  /**
   * Applied after matches to include only those URLs that also match this glob. Intended to emulate
   * the @include Greasemonkey keyword.
   */
  public var include_globs: Array<String>?

  /**
   * Applied after matches to exclude URLs that match this glob. Intended to emulate the @exclude
   * Greasemonkey keyword.
   */
  public var exclude_globs: Array<String>?
}
