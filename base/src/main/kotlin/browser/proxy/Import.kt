@file:JsModule("webextension-polyfill")
@file:JsQualifier("proxy")

package browser.proxy

import browser.events.Event
import browser.types.ChromeSetting

/**
 * Proxy settings to be used. The value of this setting is a ProxyConfig object.
 */
public external var settings: ChromeSetting

/**
 * Notifies about proxy errors.
 */
public external val onProxyError: Event<OnProxyErrorListener, Unit> = definedExternally
