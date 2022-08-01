@file:JsModule("webextension-polyfill")
@file:JsQualifier("test")

package browser.test

public external interface FtpServerProperty {
  /**
   * The port on which the FTP server is listening.
   */
  public var port: Int
}
