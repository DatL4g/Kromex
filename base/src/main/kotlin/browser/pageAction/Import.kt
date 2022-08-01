@file:JsModule("webextension-polyfill")
@file:JsQualifier("pageAction")

package browser.pageAction

import browser.events.Event
import kotlin.js.Promise

/**
 * Shows the page action. The page action is shown whenever the tab is selected.
 *
 * @param tabId The id of the tab for which you want to modify the page action.
 */
public external fun show(tabId: Int): Promise<Nothing>?

/**
 * Hides the page action. Hidden page actions still appear in the Chrome toolbar, but are grayed
 * out.
 *
 * @param tabId The id of the tab for which you want to modify the page action.
 */
public external fun hide(tabId: Int): Promise<Nothing>?

/**
 * Sets the title of the page action. This is displayed in a tooltip over the page action.
 */
public external fun setTitle(details: SetTitleDetails): Promise<Nothing>?

/**
 * Gets the title of the page action.
 */
public external fun getTitle(details: TabDetails): Promise<String>

/**
 * Sets the icon for the page action. The icon can be specified either as the path to an image file
 * or as the pixel data from a canvas element, or as dictionary of either one of those. Either the
 * <b>path</b> or the <b>imageData</b> property must be specified.
 */
public external fun setIcon(details: SetIconDetails): Promise<Nothing>?

/**
 * Sets the HTML document to be opened as a popup when the user clicks on the page action's icon.
 */
public external fun setPopup(details: SetPopupDetails): Promise<Nothing>?

/**
 * Gets the html document set as the popup for this page action.
 */
public external fun getPopup(details: TabDetails): Promise<String>

/**
 * Fired when a page action icon is clicked.  This event will not fire if the page action has a
 * popup.
 */
public external val onClicked: Event<OnClickedListener, Unit> = definedExternally
