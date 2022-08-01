@file:JsModule("webextension-polyfill")
@file:JsQualifier("pageCapture")

package browser.pageCapture

import kotlin.js.Promise
import org.w3c.dom.BinaryType

/**
 * Saves the content of the tab with given id as MHTML.
 *
 * @return Called when the MHTML has been generated.
 */
public external fun saveAsMHTML(details: SaveAsMHTMLDetails): Promise<BinaryType?>
