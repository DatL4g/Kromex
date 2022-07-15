@file:JsModule("webextension-polyfill")
@file:JsQualifier("action")

package browser.action

import browser.action.details.*
import browser.events.Event
import browser.tabs.Tab
import kotlin.js.Promise

/**
 * Sets the title of the browser action. This title appears in the tooltip.
 */
external fun setTitle(
    details: TitleDetails
): Promise<Nothing?>?

/**
 * Gets the title of the browser action.
 */
external fun getTitle(
    details: TabDetails
): Promise<String?>?

/**
 * Sets the icon for the browser action.
 * The icon can be specified as the path to an image file, as the pixel data from a canvas element, or as a dictionary of one of those.
 * Either the [details path] or the [details imageData] property must be specified.
 */
external fun setIcon(
    details: IconDetails,
    callback: (() -> Unit)?
)

/**
 * Sets the icon for the browser action.
 * The icon can be specified as the path to an image file, as the pixel data from a canvas element, or as a dictionary of one of those.
 * Either the [details path] or the [details imageData] property must be specified.
 */
external fun setIcon(
    details: IconDetails
): Promise<Nothing?>?

/**
 * Sets the HTML document to be opened as a popup when the user clicks the browser action icon.
 */
external fun setPopup(
    details: PopupDetails
) : Promise<Nothing?>?

/**
 * Gets the HTML document that is set as the popup for this browser action.
 */
external fun getPopup(
    details: TabDetails
): Promise<String?>?

/**
 * Sets the badge text for the browser action.
 * The badge is displayed on top of the icon.
 */
external fun setBadgeText(
    details: BadgeDetails
): Promise<Nothing?>?

/**
 * Gets the badge text of the browser action. If no tab is specified, the non-tab-specific badge text is returned.
 */
external fun getBadgeText(
    details: TabDetails
): Promise<String?>?

/**
 * Sets the background color for the badge.
 */
external fun setBadgeBackgroundColor(
    details: BadgeBackgroundDetails
): Promise<Nothing?>?

/**
 * Gets the background color of the browser action.
 */
external fun getBadgeBackgroundColor(
    details: TabDetails
): Promise<Array<Int>?>?

/**
 * Enables the browser action for a tab.
 * Defaults to enabled.
 *
 * @param tabId the ID of the tab for which to modify the browser action.
 */
external fun enable(
    tabId: Int? = definedExternally
): Promise<Nothing?>?

/**
 * Disables the browser action for a tab.
 *
 * @param tabId the ID of the tab for which to modify the browser action.
 */
external fun disable(
    tabId: Int? = definedExternally
): Promise<Nothing?>?

/**
 * Opens the extension popup window in the active window but does not grant tab permissions.
 */
external fun openPopup(
    callback: (Any?) -> Unit
)

/**
 * Opens the extension popup window in the active window but does not grant tab permissions.
 */
external fun openPopup(): Promise<Any?>?

/**
 * Fired when a browser action icon is clicked. Does not fire if the browser action has a popup.
 */
external val onClicked: Event<Tab?, Unit> = definedExternally