@file:JsModule("webextension-polyfill")
@file:JsQualifier("chromeosInfoPrivate")

package browser.chromeosInfoPrivate

import kotlin.js.Promise

/**
 * Fetches customization values for the given property names. See property names in the declaration
 * of the returned dictionary.
 *
 * @param propertyNames Chrome OS Property names
 */
public external fun `get`(propertyNames: Array<String>): Promise<GetReturn>

/**
 * Sets values for the given system property.
 *
 * @param propertyName Chrome OS system property name
 * @param propertyValue Chrome OS system property value
 */
public external fun `set`(propertyName: PropertyName, propertyValue: Any): Nothing

/**
 * Called to request tablet mode enabled status from the Chrome OS system.
 *
 * @return Returns tablet mode enabled status as a boolean.
 */
public external fun isTabletModeEnabled(): Promise<Boolean>
