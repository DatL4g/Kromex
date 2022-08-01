@file:JsModule("webextension-polyfill")
@file:JsQualifier("activityLogPrivate")

package browser.activityLogPrivate

/**
 * Fired when a given extension performs another activity.
 */
public external interface OnExtensionActivityListener {
  public var activity: ExtensionActivity
}
