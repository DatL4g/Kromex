@file:JsModule("webextension-polyfill")
@file:JsQualifier("privacy")

package browser.privacy

/**
 * Settings that influence Chrome's handling of network connections in general.
 */
public external var network: NetworkProperty

/**
 * Settings that enable or disable features that require third-party network services provided by
 * Google and your default search provider.
 */
public external var services: ServicesProperty

/**
 * Settings that determine what information Chrome makes available to websites.
 */
public external var websites: WebsitesProperty
