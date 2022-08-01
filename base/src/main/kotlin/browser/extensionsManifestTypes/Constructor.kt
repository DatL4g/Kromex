@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.extensionsManifestTypes

public inline fun automation(block: automation.() -> Unit): automation = (js("{}") as
    automation).apply(block)

public inline fun ContentCapabilities(block: ContentCapabilities.() -> Unit): ContentCapabilities =
    (js("{}") as ContentCapabilities).apply(block)

public inline fun ExternallyConnectable(block: ExternallyConnectable.() -> Unit):
    ExternallyConnectable = (js("{}") as ExternallyConnectable).apply(block)

public inline fun OptionsUI(block: OptionsUI.() -> Unit): OptionsUI = (js("{}") as
    OptionsUI).apply(block)

public inline fun SocketHostPatterns(block: SocketHostPatterns.() -> Unit): SocketHostPatterns =
    (js("{}") as SocketHostPatterns).apply(block)

public inline fun sockets(block: sockets.() -> Unit): sockets = (js("{}") as sockets).apply(block)

public inline fun bluetooth(block: bluetooth.() -> Unit): bluetooth = (js("{}") as
    bluetooth).apply(block)

public inline fun UsbPrinters(block: UsbPrinters.() -> Unit): UsbPrinters = (js("{}") as
    UsbPrinters).apply(block)

public inline
    fun KioskSecondaryAppsAliasProperty(block: KioskSecondaryAppsAliasProperty.() -> Unit):
    KioskSecondaryAppsAliasProperty = (js("{}") as KioskSecondaryAppsAliasProperty).apply(block)

/**
 * The <code>kiosk_secondary_apps</code> manifest property lists the secondary kiosk apps to be
 * deployed by the primary kiosk app.
 */
public typealias KioskSecondaryApps = Array<KioskSecondaryAppsAliasProperty>
