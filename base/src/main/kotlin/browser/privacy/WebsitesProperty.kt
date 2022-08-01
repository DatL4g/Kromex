@file:JsModule("webextension-polyfill")
@file:JsQualifier("privacy")

package browser.privacy

import browser.types.ChromeSetting

public external interface WebsitesProperty {
  /**
   * If disabled, Chrome blocks third-party sites from setting cookies. The value of this preference
   * is of type boolean, and the default value is <code>true</code>.
   */
  public var thirdPartyCookiesAllowed: ChromeSetting

  /**
   * If enabled, the experimental <a
   * href=”https://www.chromium.org/Home/chromium-privacy/privacy-sandbox”>Privacy Sandbox</a> features
   * are active. The value of this preference is of type boolean, and the default value is
   * <code>true</code>. PLEASE NOTE: The schema of this API may change in the future as the Privacy
   * Sandbox features crystallize. In that case, we will provide prior notice.
   */
  public var privacySandboxEnabled: ChromeSetting

  /**
   * If enabled, Chrome sends auditing pings when requested by a website (<code>&lt;a
   * ping&gt;</code>). The value of this preference is of type boolean, and the default value is
   * <code>true</code>.
   */
  public var hyperlinkAuditingEnabled: ChromeSetting

  /**
   * If enabled, Chrome sends <code>referer</code> headers with your requests. Yes, the name of this
   * preference doesn't match the misspelled header. No, we're not going to change it. The value of
   * this preference is of type boolean, and the default value is <code>true</code>.
   */
  public var referrersEnabled: ChromeSetting

  /**
   * If enabled, Chrome sends 'Do Not Track' (<code>DNT: 1</code>) header with your requests. The
   * value of this preference is of type boolean, and the default value is <code>false</code>.
   */
  public var doNotTrackEnabled: ChromeSetting

  /**
   * <strong>Available on Windows and ChromeOS only</strong>: If enabled, Chrome provides a unique
   * ID to plugins in order to run protected content. The value of this preference is of type boolean,
   * and the default value is <code>true</code>.
   */
  public var protectedContentEnabled: ChromeSetting
}
