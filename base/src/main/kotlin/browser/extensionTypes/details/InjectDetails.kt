@file:JsModule("webextension-polyfill")
@file:JsQualifier("extensionTypes")

package browser.extensionTypes.details

import browser.extensionTypes.CSSOrigin
import browser.extensionTypes.RunAt

/**
 * Details of the script or CSS to inject.
 * Either the code or the file property must be set, but both may not be set at the same time.
 */
external interface InjectDetails {
    /**
     * JavaScript or CSS code to inject.
     *
     * Warning: Be careful using the code parameter.
     * Incorrect use of it may open your extension to cross site scripting attacks.
     *
     * @see <a href=\"https://en.wikipedia.org/wiki/Cross-site_scripting\">cross site scripting</a>
     */
    var code: String?

    /**
     * JavaScript or CSS file to inject.
     */
    var file: String?

    /**
     * If allFrames is true, implies that the JavaScript or CSS should be injected into all frames of current page.
     * By default, it's false and is only injected into the top frame.
     * If true and frameId is set, then the code is inserted in the selected frame and all of its child frames.
     */
    var allFrames: Boolean?

    /**
     * The frame where the script or CSS should be injected.
     * Defaults to 0 (the top-level frame).
     *
     * @see <a href='webNavigation#frame_ids'>frame</a>
     */
    var frameId: Int?

    /**
     * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your extension has access to its parent document.
     * Code cannot be inserted in top-level about:-frames. By default it is false.
     */
    var matchAboutBlank: Boolean?

    /**
     * The soonest that the JavaScript or CSS will be injected into the tab.
     * Defaults to document_idle.
     */
    var runAt: RunAt?

    /**
     * The origin of the CSS to inject.
     * This may only be specified for CSS, not JavaScript.
     * Defaults to author.
     *
     * @see <a href=\"https://www.w3.org/TR/css3-cascade/#cascading-origins\">origin</a>
     */
    var cssOrigin: CSSOrigin?
}