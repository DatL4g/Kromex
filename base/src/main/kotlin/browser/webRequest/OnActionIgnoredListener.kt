@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

/**
 * Fired when an extension's proposed modification to a network request is ignored. This happens in
 * case of conflicts with other extensions.
 */
public external interface OnActionIgnoredListener {
  public var details: DetailsProperty
}
