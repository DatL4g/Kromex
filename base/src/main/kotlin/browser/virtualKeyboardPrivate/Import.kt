@file:JsModule("webextension-polyfill")
@file:JsQualifier("virtualKeyboardPrivate")

package browser.virtualKeyboardPrivate

import browser.events.Event
import kotlin.js.Promise

/**
 * Inserts text into the currently focused text field.
 *
 * @param text The text that will be inserted.
 * @return Called when the insertion is completed.
 */
public external fun insertText(text: String): Promise<Nothing>?

/**
 * Sends a fabricated key event to the focused input field.
 *
 * @return Called after processing the event.
 */
public external fun sendKeyEvent(keyEvent: VirtualKeyboardEvent): Promise<Nothing>?

/**
 * Hides the virtual keyboard.
 *
 * @return Called when the keyboard is hidden.
 */
public external fun hideKeyboard(): Promise<Nothing>?

/**
 * Sets the state of the hotrod virtual keyboard. This API should only be used by hotrod.
 */
public external fun setHotrodKeyboard(enable: Boolean): Nothing

/**
 * Sets the lock state of the virtual keyboard. A locked keyboard remains visible even after a text
 * area loses input focus.
 */
public external fun lockKeyboard(lock: Boolean): Nothing

/**
 * Inform the system that the keyboard has loaded.
 *
 * @return Called when load acknowledgement is complete.
 */
public external fun keyboardLoaded(): Promise<Nothing>?

/**
 * Gets the virtual keyboard configuration.
 *
 * @return Called when querying virtual keyboard configuration is complete.
 */
public external fun getKeyboardConfig(): Promise<KeyboardConfig>

/**
 * Opens chrome://os-settings/osLanguages page.
 */
public external fun openSettings(): Nothing

/**
 * Opens chrome://os-settings/osLanguages/smartInputs page.
 */
public external fun openSuggestionSettings(): Nothing

/**
 * Sets the virtual keyboard container behavior
 *
 * @param options Optional parameters for new container behavior.
 * @return Called when container mode is ready to change, or if the operation failed.
 */
public external fun setContainerBehavior(options: ContainerBehaviorOptions): Promise<Boolean>?

/**
 * Sets the virtual keyboard draggable area bounds.
 *
 * @param bounds The value of draggable rect area of floating keyboard.
 */
public external fun setDraggableArea(bounds: Bounds): Nothing

/**
 * Requests the virtual keyboard to change state.
 *
 * @param state The value of the virtual keyboard state to change to.
 */
public external fun setKeyboardState(state: KeyboardState): Nothing

/**
 * Sets the areas on the screen that are blocked by the virtual keyboard.
 *
 * @param boundsList List of rectangles representing regions occluded by the keyboard.
 */
public external fun setOccludedBounds(boundsList: Array<Bounds>): Nothing

/**
 * Sets the areas on the keyboard window where events are handled. Any event outside of these areas
 * are passed on to the window behind it.
 *
 * @param boundsList List of rectangles representing regions where events targeting the keyboard
 * should be handled.
 */
public external fun setHitTestBounds(boundsList: Array<Bounds>): Nothing

/**
 * Sets the area of the keyboard window that should not move off screen. Any area outside of this
 * can be moved off the user's screen.
 *
 * @param bounds The bounds of the area inside the keyboard window, relative to the window origin,
 * that should not be moved off screen. Any area outside of this bounds can be moved off screen.
 */
public external fun setAreaToRemainOnScreen(bounds: Bounds): Nothing

/**
 * Sets the bounds of the keyboard window in screen coordinates.
 *
 * @param bounds A rectangle defining the new bounds of the window in screen coordinates.
 */
public external fun setWindowBoundsInScreen(bounds: Bounds): Nothing

/**
 * Get the clipboard history
 *
 * @return Called when querying the ClipboardHistory is complete.
 */
public external fun getClipboardHistory(options: GetClipboardHistoryOptions):
    Promise<Array<ClipboardItem>>

/**
 * Pastes a clipboard item from the clipboard history.
 *
 * @param itemId The unique id which identifies this clipboard item.
 */
public external fun pasteClipboardItem(itemId: String): Nothing

/**
 * Deletes a clipboard item from the clipboard history.
 *
 * @param itemId The unique id which identifies this clipboard item.
 */
public external fun deleteClipboardItem(itemId: String): Nothing

/**
 * This event is sent when virtual keyboard bounds changed and overscroll/resize is enabled.
 */
public external val onBoundsChanged: Event<OnBoundsChangedListener, Unit> = definedExternally

/**
 * Fired when the virtual keyboard window has been closed. For example, this can happen when turning
 * off on-screen keyboard or exiting tablet mode.
 */
public external val onKeyboardClosed: Event<Nothing, Unit> = definedExternally

/**
 * Fired when a configuration for virtual keyboard IME has changed, e.g. auto complete disabled.
 */
public external val onKeyboardConfigChanged: Event<OnKeyboardConfigChangedListener, Unit> =
    definedExternally

/**
 * Fired when the list of items in the clipboard history changes.
 */
public external val onClipboardHistoryChanged: Event<OnClipboardHistoryChangedListener, Unit> =
    definedExternally

/**
 * Fired when the data in a specific clipboard item is updated (mainly used for sending updated
 * rendered html image).
 */
public external val onClipboardItemUpdated: Event<OnClipboardItemUpdatedListener, Unit> =
    definedExternally
