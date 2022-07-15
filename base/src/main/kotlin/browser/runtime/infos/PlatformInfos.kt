@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime.infos

import browser.runtime.PlatformArch
import browser.runtime.PlatformNaclArch
import browser.runtime.PlatformOs

/**
 * An object containing information about the current platform.
 */
external interface PlatformInfos {
    /**
     * The operating system Chrome is running on.
     */
    var os: PlatformOs?

    /**
     * The machine's processor architecture.
     */
    var arch: PlatformArch?

    /**
     * The native client architecture.
     * This may be different from arch on some platforms.
     */
    var nacl_arch: PlatformNaclArch?
}