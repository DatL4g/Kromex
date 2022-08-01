@file:JsModule("webextension-polyfill")
@file:JsQualifier("contextMenus")

package browser.contextMenus

import browser.events.Event
import kotlin.js.Promise

/**
 * The maximum number of top level extension items that can be added to an extension action context
 * menu. Any items beyond this limit will be ignored.
 */
public external val ACTION_MENU_TOP_LEVEL_LIMIT: Number = definedExternally

/**
 * Creates a new context menu item. If an error occurs during creation, it may not be detected until
 * the creation callback fires; details will be in $(ref:runtime.lastError).
 *
 * @return The ID of the newly created item.
 */
public external fun create(createProperties: CreateCreateProperties): Promise<Nothing>

/**
 * Updates a previously created context menu item.
 *
 * @param id The ID of the item to update.
 * @param updateProperties The properties to update. Accepts the same values as the
 * $(ref:contextMenus.create) function.
 * @return Called when the context menu has been updated.
 */
public external fun update(id: Any, updateProperties: UpdateUpdateProperties): Promise<Nothing>

/**
 * Removes a context menu item.
 *
 * @param menuItemId The ID of the context menu item to remove.
 * @return Called when the context menu has been removed.
 */
public external fun remove(menuItemId: Any): Promise<Nothing>

/**
 * Removes all context menu items added by this extension.
 *
 * @return Called when removal is complete.
 */
public external fun removeAll(): Promise<Nothing>

/**
 * Fired when a context menu item is clicked.
 */
public external val onClicked: Event<OnClickedListener, Unit> = definedExternally
