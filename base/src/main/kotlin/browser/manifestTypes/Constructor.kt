@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.manifestTypes

public inline fun ChromeSettingsOverrides(block: ChromeSettingsOverrides.() -> Unit):
    ChromeSettingsOverrides = (js("{}") as ChromeSettingsOverrides).apply(block)

public inline fun FileSystemProviderCapabilities(block: FileSystemProviderCapabilities.() -> Unit):
    FileSystemProviderCapabilities = (js("{}") as FileSystemProviderCapabilities).apply(block)
