@file:JsModule("webextension-polyfill")
@file:JsQualifier("extensionsManifestTypes")

package browser.extensionsManifestTypes

public external interface FiltersProperty {
  /**
   * USB vendor ID of matching devices
   */
  public var vendorId: Int

  /**
   * USB product ID of matching devices
   */
  public var productId: Int?

  /**
   * USB interface class implemented by any interface of a matching device.
   */
  public var interfaceClass: Int?

  /**
   * USB interface sub-class implemented by the interface matching $(ref:interfaceClass).
   */
  public var interfaceSubclass: Int?

  /**
   * USB interface protocol implemented by the interface matching $(ref:interfaceClass) and
   * $(ref:interfaceSubclass).
   */
  public var interfaceProtocol: Int?
}
