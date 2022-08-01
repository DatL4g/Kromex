@file:JsModule("webextension-polyfill")
@file:JsQualifier("privacy")

package browser.privacy

import browser.types.ChromeSetting

public external interface NetworkProperty {
  /**
   * If enabled, Chrome attempts to speed up your web browsing experience by pre-resolving DNS
   * entries and preemptively opening TCP and SSL connections to servers. This preference only affects
   * actions taken by Chrome's internal prediction service. It does not affect webpage-initiated
   * prefectches or preconnects. This preference's value is a boolean, defaulting to <code>true</code>.
   */
  public var networkPredictionEnabled: ChromeSetting

  /**
   * Allow users to specify the media performance/privacy tradeoffs which impacts how WebRTC traffic
   * will be routed and how much local address information is exposed. This preference's value is of
   * type IPHandlingPolicy, defaulting to <code>default</code>.
   */
  public var webRTCIPHandlingPolicy: ChromeSetting
}
