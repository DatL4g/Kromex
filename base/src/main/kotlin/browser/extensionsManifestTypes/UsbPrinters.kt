@file:JsModule("webextension-polyfill")
@file:JsQualifier("extensionsManifestTypes")

package browser.extensionsManifestTypes

/**
 * The <code>usb_printers</code> manifest property lists the USB printers supported by an app
 * implementing the $(ref:printerProvider) API.
 */
public external interface UsbPrinters {
  /**
   * A list of $(ref:usb.DeviceFilter USB device filters) matching supported devices. A device only
   * needs to match one of the provided filters. A <code>vendorId</code> is required and only one of
   * <code>productId</code> or <code>interfaceClass</code> may be provided.
   */
  public var filters: Array<FiltersProperty>
}
