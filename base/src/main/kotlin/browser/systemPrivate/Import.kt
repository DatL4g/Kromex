@file:JsModule("webextension-polyfill")
@file:JsQualifier("systemPrivate")

package browser.systemPrivate

import kotlin.js.Promise

/**
 * Returns whether the incognito mode is enabled, disabled or forced
 *
 * @return Called with the result.
 */
public external fun getIncognitoModeAvailability(): Promise<GetIncognitoModeAvailabilityValue>

/**
 * Gets information about the system update.
 */
public external fun getUpdateStatus(): Promise<UpdateStatus>

/**
 * Gets Chrome's API key to use for requests to Google services.
 */
public external fun getApiKey(): Promise<String>
