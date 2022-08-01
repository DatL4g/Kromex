@file:JsModule("webextension-polyfill")
@file:JsQualifier("echoPrivate")

package browser.echoPrivate

import kotlin.js.Promise

/**
 * Sets the offer info in Local State.
 *
 * @param id The service id of the echo offer.
 * @param offerInfo The offer info.
 */
public external fun setOfferInfo(id: String, offerInfo: Any): Nothing

/**
 * Check in Local State for the offer info.
 *
 * @param id The service id of the offer eligibility check.
 */
public external fun getOfferInfo(id: String): Promise<Any>

/**
 * Get the group or coupon code from underlying storage.
 *
 * @param type Type of coupon code requested to be read (coupon or group).
 */
public external fun getRegistrationCode(type: String): Promise<String>

/**
 * Get the OOBE timestamp.
 */
public external fun getOobeTimestamp(): Promise<String>

/**
 * If device policy allows user to redeem offer, displays a native dialog asking user for a consent
 * to verify device's eligibility for the offer. If the device policy forbids user to redeem offers,
 * displays a native dialog informing user the offer redeeming is disabled.
 *
 * @param consentRequester Information about the service requesting user consent.
 */
public external fun getUserConsent(consentRequester: GetUserConsentConsentRequester):
    Promise<Boolean>
