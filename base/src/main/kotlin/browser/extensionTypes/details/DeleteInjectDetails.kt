@file:JsModule("webextension-polyfill")
@file:JsQualifier("extensionTypes")

package browser.extensionTypes.details

import browser.extensionTypes.CSSOrigin

/**
 * Details of the CSS to remove.
 * Either the code or the file property must be set, but both may not be set at the same time.
 */
external interface DeleteInjectDetails {
    /**
     * CSS code to remove.
     */
    var code: String?

    /**
     * CSS file to remove.
     */
    var file: String?

    /**
     * If allFrames is true, implies that the CSS should be removed from all frames of current page.
     * By default, it's false and is only removed from the top frame.
     * If true and frameId is set, then the code is removed from the selected frame and all of its child frames.
     */
    var allFrames: Boolean?

    /**
     * The frame from where the CSS should be removed.
     * Defaults to 0 (the top-level frame).
     *
     * @see <a href='webNavigation#frame_ids'>frame</a>
     */
    var frameId: Int?

    /**
     * If matchAboutBlank is true, then the code is also removed from about:blank and about:srcdoc frames if your extension has access to its parent document.
     * By default, it is false.
     */
    var matchAboutBlank: Boolean?

    /**
     * The origin of the CSS to remove. Defaults to author.
     *
     * @see <a href=\"https://www.w3.org/TR/css3-cascade/#cascading-origins\">origin</a>
     */
    var cssOrigin: CSSOrigin?
}