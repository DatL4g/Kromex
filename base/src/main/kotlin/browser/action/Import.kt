@file:JsModule("webextension-polyfill")
@file:JsQualifier("action")

package browser.action

import browser.browserAction.ColorArray
import browser.events.Event
import kotlin.js.Promise

/**
 * Sets the title of the action. This shows up in the tooltip.
 */
public external fun setTitle(details: SetTitleDetails): Promise<Nothing>?

/**
 * Gets the title of the action.
 */
public external fun getTitle(details: TabDetails): Promise<String>

/**
 * Sets the icon for the action. The icon can be specified either as the path to an image file or as
 * the pixel data from a canvas element, or as dictionary of either one of those. Either the
 * <b>path</b> or the <b>imageData</b> property must be specified.
 */
public external fun setIcon(details: SetIconDetails): Promise<Nothing>?

/**
 * Sets the HTML document to be opened as a popup when the user clicks on the action's icon.
 */
public external fun setPopup(details: SetPopupDetails): Promise<Nothing>?

/**
 * Gets the html document set as the popup for this action.
 */
public external fun getPopup(details: TabDetails): Promise<String>

/**
 * Sets the badge text for the action. The badge is displayed on top of the icon.
 */
public external fun setBadgeText(details: SetBadgeTextDetails): Promise<Nothing>?

/**
 * Gets the badge text of the action. If no tab is specified, the non-tab-specific badge text is
 * returned. If <a
 * href='declarativeNetRequest#setExtensionActionOptions'>displayActionCountAsBadgeText</a> is enabled,
 * a placeholder text will be returned unless the <a
 * href='declare_permissions#declarativeNetRequestFeedback'>declarativeNetRequestFeedback</a>
 * permission is present or tab-specific badge text was provided.
 */
public external fun getBadgeText(details: TabDetails): Promise<String>

/**
 * Sets the background color for the badge.
 */
public external fun setBadgeBackgroundColor(details: SetBadgeBackgroundColorDetails):
    Promise<Nothing>?

/**
 * Gets the background color of the action.
 */
public external fun getBadgeBackgroundColor(details: TabDetails): Promise<ColorArray>

/**
 * Enables the action for a tab. By default, actions are enabled.
 *
 * @param tabId The id of the tab for which you want to modify the action.
 */
public external fun enable(tabId: Int? = definedExternally): Promise<Nothing>?

/**
 * Disables the action for a tab.
 *
 * @param tabId The id of the tab for which you want to modify the action.
 */
public external fun disable(tabId: Int? = definedExternally): Promise<Nothing>?

/**
 * Returns the user-specified settings relating to an extension's action.
 */
public external fun getUserSettings(): Promise<UserSettings>

/**
 * Opens the extension's popup.
 *
 * @param options Specifies options for opening the popup.
 */
public external fun openPopup(options: OpenPopupOptions? = definedExternally): Promise<Nothing>

/**
 * Fired when an action icon is clicked.  This event will not fire if the action has a popup.
 */
public external val onClicked: Event<OnClickedListener, Unit> = definedExternally
