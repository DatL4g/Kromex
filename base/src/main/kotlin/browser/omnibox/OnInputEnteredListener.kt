@file:JsModule("webextension-polyfill")
@file:JsQualifier("omnibox")

package browser.omnibox

/**
 * User has accepted what is typed into the omnibox.
 */
public external interface OnInputEnteredListener {
  public var text: String

  public var disposition: OnInputEnteredDisposition
}
