@file:JsModule("webextension-polyfill")
@file:JsQualifier("sessions")

package browser.sessions

public external interface Device {
  public var info: String

  /**
   * The name of the foreign device.
   */
  public var deviceName: String

  /**
   * A list of open window sessions for the foreign device, sorted from most recently to least
   * recently modified session.
   */
  public var sessions: Array<Session>
}
