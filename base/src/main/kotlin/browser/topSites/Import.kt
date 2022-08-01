@file:JsModule("webextension-polyfill")
@file:JsQualifier("topSites")

package browser.topSites

import kotlin.js.Promise

/**
 * Gets a list of top sites.
 */
public external fun `get`(): Promise<Array<MostVisitedURL>>
