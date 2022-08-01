@file:JsModule("webextension-polyfill")
@file:JsQualifier("webNavigation")

package browser.webNavigation

/**
 * Fired when a navigation is committed. The document (and the resources it refers to, such as
 * images and subframes) might still be downloading, but at least part of the document has been
 * received from the server and the browser has decided to switch to the new document.
 */
public external interface OnCommittedListener {
  public var details: DetailsProperty
}
