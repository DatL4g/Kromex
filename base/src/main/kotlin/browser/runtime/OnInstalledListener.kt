@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime

/**
 * Fired when the extension is first installed, when the extension is updated to a new version, and
 * when Chrome is updated to a new version.
 */
public external interface OnInstalledListener {
  public var details: DetailsProperty
}
