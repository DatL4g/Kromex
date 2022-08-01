@file:JsModule("webextension-polyfill")
@file:JsQualifier("browserAction")

package browser.browserAction

import org.w3c.dom.ImageData

/**
 * Pixel data for an image. Must be an ImageData object; for example, from a <code>canvas</code>
 * element.
 */
public abstract external class ImageDataType : ImageData
