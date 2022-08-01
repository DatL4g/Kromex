@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime

/**
 * An object containing information about the current platform.
 */
public external interface PlatformInfo {
  /**
   * The operating system Chrome is running on.
   */
  public var os: PlatformOs

  /**
   * The machine's processor architecture.
   */
  public var arch: PlatformArch

  /**
   * The native client architecture. This may be different from arch on some platforms.
   */
  public var nacl_arch: PlatformNaclArch
}
