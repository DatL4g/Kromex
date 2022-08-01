@file:JsModule("webextension-polyfill")
@file:JsQualifier("cookies")

package browser.cookies

import browser.events.Event
import kotlin.js.Promise

/**
 * Retrieves information about a single cookie. If more than one cookie of the same name exists for
 * the given URL, the one with the longest path will be returned. For cookies with the same path
 * length, the cookie with the earliest creation time will be returned.
 */
public external fun `get`(details: CookieDetails): Promise<Cookie?>

/**
 * Retrieves all cookies from a single cookie store that match the given information.  The cookies
 * returned will be sorted, with those with the longest path first.  If multiple cookies have the same
 * path length, those with the earliest creation time will be first.
 *
 * @param details Information to filter the cookies being retrieved.
 */
public external fun getAll(details: GetAllDetails): Promise<Array<Cookie>>

/**
 * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
 *
 * @param details Details about the cookie being set.
 */
public external fun `set`(details: SetDetails): Promise<Cookie?>?

/**
 * Deletes a cookie by name.
 */
public external fun remove(details: CookieDetails): Promise<RemoveReturn?>?

/**
 * Lists all existing cookie stores.
 */
public external fun getAllCookieStores(): Promise<Array<CookieStore>>

/**
 * Fired when a cookie is set or removed. As a special case, note that updating a cookie's
 * properties is implemented as a two step process: the cookie to be updated is first removed entirely,
 * generating a notification with "cause" of "overwrite" .  Afterwards, a new cookie is written with
 * the updated values, generating a second notification with "cause" "explicit".
 */
public external val onChanged: Event<OnChangedListener, Unit> = definedExternally
