@file:JsModule("webextension-polyfill")
@file:JsQualifier("cookies")

package browser.cookies

/**
 * Fired when a cookie is set or removed. As a special case, note that updating a cookie's
 * properties is implemented as a two step process: the cookie to be updated is first removed entirely,
 * generating a notification with "cause" of "overwrite" .  Afterwards, a new cookie is written with
 * the updated values, generating a second notification with "cause" "explicit".
 */
public external interface OnChangedListener {
  public var changeInfo: ChangeInfoProperty
}
