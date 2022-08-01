@file:JsModule("webextension-polyfill")
@file:JsQualifier("extensionsManifestTypes")

package browser.extensionsManifestTypes

/**
 * The <code>bluetooth</code> manifest property give permission to an app to use the
 * $(ref:bluetooth) API. A list of UUIDs can be optionally specified to enable communication with
 * devices.
 */
public external interface bluetooth {
  /**
   * The <code>uuids</code> manifest property declares the list of protocols, profiles and services
   * that an app can communicate using.
   */
  public var uuids: Array<String>?

  /**
   * If <code>true</code>, gives permission to an app to use the $(ref:bluetoothSocket) API
   */
  public var socket: Boolean?

  /**
   * If <code>true</code>, gives permission to an app to use the $(ref:bluetoothLowEnergy) API
   */
  public var low_energy: Boolean?

  /**
   * If <code>true</code>, gives permission to an app to use the advertisement functions in the
   * $(ref:bluetoothLowEnergy) API
   */
  public var peripheral: Boolean?
}
