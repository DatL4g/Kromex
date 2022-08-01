@file:JsModule("webextension-polyfill")
@file:JsQualifier("permissions")

package browser.permissions

import browser.events.Event
import kotlin.js.Promise

/**
 * Gets the extension's current set of permissions.
 */
public external fun getAll(): Promise<Permissions>

/**
 * Checks if the extension has the specified permissions.
 */
public external fun contains(permissions: Permissions): Promise<Boolean>

/**
 * Requests access to the specified permissions, displaying a prompt to the user if necessary. These
 * permissions must either be defined in the <code>optional_permissions</code> field of the manifest or
 * be required permissions that were withheld by the user. Paths on origin patterns will be ignored.
 * You can request subsets of optional origin permissions; for example, if you specify
 * <code>*://///</code> in the <code>optional_permissions</code> section of the manifest, you can
 * request <code>http://example.com/</code>. If there are any problems requesting the permissions,
 * $(ref:runtime.lastError) will be set.
 */
public external fun request(permissions: Permissions): Promise<Boolean>?

/**
 * Removes access to the specified permissions. If there are any problems removing the permissions,
 * $(ref:runtime.lastError) will be set.
 */
public external fun remove(permissions: Permissions): Promise<Boolean>?

/**
 * Fired when the extension acquires new permissions.
 */
public external val onAdded: Event<OnAddedListener, Unit> = definedExternally

/**
 * Fired when access to permissions has been removed from the extension.
 */
public external val onRemoved: Event<OnRemovedListener, Unit> = definedExternally
