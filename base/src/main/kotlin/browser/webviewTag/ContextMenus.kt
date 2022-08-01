@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

import browser.events.Event
import kotlin.js.Promise

public external interface ContextMenus {
  /**
   * Fired before showing a context menu on this <code>webview</code>. Can be used to disable this
   * context menu by calling <code>event.preventDefault()</code>.
   */
  public val onShow: Event<OnShowListener, Unit>

  /**
   * Creates a new context menu item. Note that if an error occurs during creation, you may not find
   * out until the creation callback fires (the details will be in $(ref:runtime.lastError)).
   *
   * @param createProperties The properties used to create the item
   * @return The ID of the newly created item.
   */
  public fun create(createProperties: Any): Promise<Nothing>

  /**
   * Updates a previously created context menu item.
   *
   * @param id The ID of the item to update.
   * @param updateProperties The properties to update. Accepts the same values as the create
   * function.
   * @return Called when the context menu has been updated.
   */
  public fun update(id: Any, updateProperties: Any): Promise<Nothing>

  /**
   * Removes a context menu item.
   *
   * @param menuItemId The ID of the context menu item to remove.
   * @return Called when the context menu has been removed.
   */
  public fun remove(menuItemId: Any): Promise<Nothing>

  /**
   * Removes all context menu items added to this <code>webview</code>.
   *
   * @return Called when removal is complete.
   */
  public fun removeAll(): Promise<Nothing>
}
