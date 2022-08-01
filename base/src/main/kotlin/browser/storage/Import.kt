@file:JsModule("webextension-polyfill")
@file:JsQualifier("storage")

package browser.storage

import browser.events.Event

/**
 * Items in the <code>sync</code> storage area are synced using Chrome Sync.
 */
public external val sync: StorageArea = definedExternally

/**
 * Items in the <code>local</code> storage area are local to each machine.
 */
public external val local: StorageArea = definedExternally

/**
 * Items in the <code>managed</code> storage area are set by the domain administrator, and are
 * read-only for the extension; trying to modify this namespace results in an error.
 */
public external val managed: StorageArea = definedExternally

/**
 * Items in the <code>session</code> storage area are stored in-memory and will not be persisted to
 * disk.
 */
public external val session: StorageArea = definedExternally

/**
 * Fired when one or more items change.
 */
public external val onChanged: Event<OnChangedListener, Unit> = definedExternally
