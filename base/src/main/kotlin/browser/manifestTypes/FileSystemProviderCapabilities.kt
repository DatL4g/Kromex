@file:JsModule("webextension-polyfill")
@file:JsQualifier("manifestTypes")

package browser.manifestTypes

/**
 * Represents capabilities of a providing extension.
 */
public external interface FileSystemProviderCapabilities {
  /**
   * Whether configuring via <code>onConfigureRequested</code> is supported. By default:
   * <code>false</code>.
   */
  public var configurable: Boolean?

  /**
   * Whether multiple (more than one) mounted file systems are supported. By default:
   * <code>false</code>.
   */
  public var multiple_mounts: Boolean?

  /**
   * Whether setting watchers and notifying about changes is supported. By default:
   * <code>false</code>.
   */
  public var watchable: Boolean?

  /**
   * Source of data for mounted file systems.
   */
  public var source: FileSystemProviderSource
}
