@file:JsModule("webextension-polyfill")
@file:JsQualifier("browserAction")

package browser.browserAction

import browser.events.Event
import kotlin.js.Promise

/**
 * Sets the title of the browser action. This title appears in the tooltip.
 */
public external fun setTitle(details: SetTitleDetails): Promise<Nothing>?

/**
 * Gets the title of the browser action.
 */
public external fun getTitle(details: TabDetails): Promise<String>

/**
 * Sets the icon for the browser action. The icon can be specified as the path to an image file, as
 * the pixel data from a canvas element, or as a dictionary of one of those. Either the
 * <code>path</code> or the <code>imageData</code> property must be specified.
 */
public external fun setIcon(details: SetIconDetails): Promise<Nothing>

/**
 * Sets the HTML document to be opened as a popup when the user clicks the browser action icon.
 */
public external fun setPopup(details: SetPopupDetails): Promise<Nothing>?

/**
 * Gets the HTML document that is set as the popup for this browser action.
 */
public external fun getPopup(details: TabDetails): Promise<String>

/**
 * Sets the badge text for the browser action. The badge is displayed on top of the icon.
 */
public external fun setBadgeText(details: SetBadgeTextDetails): Promise<Nothing>?

/**
 * Gets the badge text of the browser action. If no tab is specified, the non-tab-specific badge
 * text is returned.
 */
public external fun getBadgeText(details: TabDetails): Promise<String>

/**
 * Sets the background color for the badge.
 */
public external fun setBadgeBackgroundColor(details: SetBadgeBackgroundColorDetails):
    Promise<Nothing>?

/**
 * Gets the background color of the browser action.
 */
public external fun getBadgeBackgroundColor(details: TabDetails): Promise<ColorArray>

/**
 * Enables the browser action for a tab. Defaults to enabled.
 *
 * @param tabId The ID of the tab for which to modify the browser action.
 */
public external fun enable(tabId: Int? = definedExternally): Promise<Nothing>?

/**
 * Disables the browser action for a tab.
 *
 * @param tabId The ID of the tab for which to modify the browser action.
 */
public external fun disable(tabId: Int? = definedExternally): Promise<Nothing>?

/**
 * Opens the extension popup window in the active window but does not grant tab permissions.
 */
public external fun openPopup(): Promise<Any?>

/**
 * Fired when a browser action icon is clicked. Does not fire if the browser action has a popup.
 */
public external val onClicked: Event<OnClickedListener, Unit> = definedExternally
