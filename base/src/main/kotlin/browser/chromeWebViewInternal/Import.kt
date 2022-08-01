@file:JsModule("webextension-polyfill")
@file:JsQualifier("chromeWebViewInternal")

package browser.chromeWebViewInternal

import browser.events.Event
import kotlin.js.Promise

/**
 * @return The ID of the newly created item.
 */
public external fun contextMenusCreate(instanceId: Int,
    createProperties: ContextMenusCreateCreateProperties): Promise<Nothing>

/**
 * Updates a previously created context menu item.
 * @param id The ID of the item to update.
 * @param updateProperties The properties to update. Accepts the same values as the create function.
 *
 * @return Called when the context menu has been updated.
 */
public external fun contextMenusUpdate(
  instanceId: Int,
  id: Any,
  updateProperties: ContextMenusUpdateUpdateProperties,
): Promise<Nothing>

/**
 * Removes a context menu item.
 * @param menuItemId The ID of the context menu item to remove.
 *
 * @return Called when the context menu has been removed.
 */
public external fun contextMenusRemove(instanceId: Int, menuItemId: Any): Promise<Nothing>

/**
 * Removes all context menu items added by this webview.
 *
 * @return Called when removal is complete.
 */
public external fun contextMenusRemoveAll(instanceId: Int): Promise<Nothing>

/**
 * @param instanceId The instance ID of the guest &lt;webview&gt; process. This not exposed to
 * developers through the API.
 * @param requestId The strictly increasing request counter that serves as ID for the context menu.
 * This not exposed to developers through the API.
 * @param itemsToShow Items to be shown in the context menu. These are top level items as opposed to
 * children items.
 */
public external fun showContextMenu(
  instanceId: Int,
  requestId: Int,
  itemsToShow: Array<ContextMenuItem> = definedExternally,
): Nothing

public external val onClicked: Event<Nothing, Unit> = definedExternally

/**
 * Fired when context menu is about to be shown. Provides the ability to cancel the context menu by
 * calling <code>event.preventDefault()</code> from this handler.
 */
public external val onShow: Event<OnShowListener, Unit> = definedExternally
