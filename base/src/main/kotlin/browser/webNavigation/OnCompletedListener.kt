@file:JsModule("webextension-polyfill")
@file:JsQualifier("webNavigation")

package browser.webNavigation

/**
 * Fired when a document, including the resources it refers to, is completely loaded and
 * initialized.
 */
public external interface OnCompletedListener {
  public var details: DetailsProperty
}
