@file:JsModule("webextension-polyfill")
@file:JsQualifier("chromeosInfoPrivate")

package browser.chromeosInfoPrivate

/**
 * Dictionary which contains all requested properties
 */
public external interface GetReturn {
  /**
   * Board name
   */
  public var board: String?

  /**
   * Customization ID
   */
  public var customizationId: String?

  /**
   * Home provider which is used by the cellular device
   */
  public var homeProvider: String?

  /**
   * Hardware ID
   */
  public var hwid: String?

  /**
   * True if Chrome is built with is_cfm build flag
   */
  public var isMeetDevice: Boolean?

  /**
   * Initial locale for the device
   */
  public var initialLocale: String?

  /**
   * True if current logged in user is device owner
   */
  public var isOwner: Boolean?

  public var sessionType: SessionType?

  public var playStoreStatus: PlayStoreStatus?

  public var managedDeviceStatus: ManagedDeviceStatus?

  public var deviceType: DeviceType?

  public var stylusStatus: StylusStatus?

  public var assistantStatus: AssistantStatus?

  /**
   * Device client id
   */
  public var clientId: String?

  /**
   * Timezone
   */
  public var timezone: String?

  /**
   * If true, ChromeOS is showing enlarged cursor.
   */
  public var a11yLargeCursorEnabled: Boolean?

  /**
   * If true, sticky keys are turned on.
   */
  public var a11yStickyKeysEnabled: Boolean?

  /**
   * If enabled, ChromeOS text-to-speech feature is turned on.
   */
  public var a11ySpokenFeedbackEnabled: Boolean?

  /**
   * If true, all displays have high contrast mode turned on.
   */
  public var a11yHighContrastEnabled: Boolean?

  /**
   * If true, all displays have screen magnifier turned on.
   */
  public var a11yScreenMagnifierEnabled: Boolean?

  /**
   * If true, autoclick accessibility feature is turned on.
   */
  public var a11yAutoClickEnabled: Boolean?

  /**
   * If true, virtual keyboard will be enabled.
   */
  public var a11yVirtualKeyboardEnabled: Boolean?

  /**
   * If true, caret highlighting will be enabled.
   */
  public var a11yCaretHighlightEnabled: Boolean?

  /**
   * If true, cursor highlighting will be enabled.
   */
  public var a11yCursorHighlightEnabled: Boolean?

  /**
   * If true, focus highlighting will be enabled.
   */
  public var a11yFocusHighlightEnabled: Boolean?

  /**
   * If true, select to speak will be enabled.
   */
  public var a11ySelectToSpeakEnabled: Boolean?

  /**
   * If true, switch access will be enabled.
   */
  public var a11ySwitchAccessEnabled: Boolean?

  /**
   * If true, colorized cursor will be enabled.
   */
  public var a11yCursorColorEnabled: Boolean?

  /**
   * If true, docked magnifier will be enabled.
   */
  public var a11yDockedMagnifierEnabled: Boolean?

  /**
   * If true, the ChromeOS top row keys send function keys.
   */
  public var sendFunctionKeys: Boolean?

  /**
   * List of supported timezones definitions.
   */
  public var supportedTimezones: Array<Any>?
}
