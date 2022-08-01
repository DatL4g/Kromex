@file:JsModule("webextension-polyfill")
@file:JsQualifier("storage")

package browser.storage

import browser.events.Event

/**
 * Items in the <code>sync</code> storage area are synced using Chrome Sync.
 */
public external var sync: StorageArea

/**
 * Items in the <code>local</code> storage area are local to each machine.
 */
public external var local: StorageArea

/**
 * Items in the <code>managed</code> storage area are set by the domain administrator, and are
 * read-only for the extension; trying to modify this namespace results in an error.
 */
public external var managed: StorageArea

/**
 * Items in the <code>session</code> storage area are stored in-memory and will not be persisted to
 * disk.
 */
public external var session: StorageArea

/**
 * Fired when one or more items change.
 */
public external val onChanged: Event<OnChangedListener, Unit> = definedExternally
