@file:JsModule("webextension-polyfill")
@file:JsQualifier("terminalPrivate")

package browser.terminalPrivate

/**
 * Fired when pref changes.
 */
public external interface OnPrefChangedListener {
  /**
   * Prefs keyed by paths.
   */
  public var prefs: Any
}
