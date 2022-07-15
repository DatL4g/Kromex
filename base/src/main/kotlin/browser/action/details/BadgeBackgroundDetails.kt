@file:JsModule("webextension-polyfill")
@file:JsQualifier("action")

package browser.action.details

external interface BadgeBackgroundDetails {

    /**
     * An array of four integers in the range 0-255 that make up the RGBA color of the badge.
     * Can also be a string with a CSS hex color value; for example, #FF0000 or #F00 (red).
     * Renders colors at full opacity.
     */
    var color: Any

    /**
     * Limits the change to when a particular tab is selected.
     * Automatically resets when the tab is closed.
     */
    var tabId: Int?
}