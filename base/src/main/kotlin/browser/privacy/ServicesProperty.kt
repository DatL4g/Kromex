@file:JsModule("webextension-polyfill")
@file:JsQualifier("privacy")

package browser.privacy

import browser.types.ChromeSetting

public external interface ServicesProperty {
  /**
   * If enabled, Chrome uses a web service to help resolve navigation errors. This preference's
   * value is a boolean, defaulting to <code>true</code>.
   */
  public var alternateErrorPagesEnabled: ChromeSetting

  /**
   * If enabled, Chrome offers to automatically fill in forms. This preference's value is a boolean,
   * defaulting to <code>true</code>.
   */
  @Deprecated(
    message =
        "Please use privacy.services.autofillAddressEnabled and privacy.services.autofillCreditCardEnabled. This remains for backward compatibility in this release and will be removed in the future.",
    level = DeprecationLevel.WARNING,
  )
  public var autofillEnabled: ChromeSetting

  /**
   * If enabled, Chrome offers to automatically fill in addresses and other form data. This
   * preference's value is a boolean, defaulting to <code>true</code>.
   */
  public var autofillAddressEnabled: ChromeSetting

  /**
   * If enabled, Chrome offers to automatically fill in credit card forms. This preference's value
   * is a boolean, defaulting to <code>true</code>.
   */
  public var autofillCreditCardEnabled: ChromeSetting

  /**
   * If enabled, the password manager will ask if you want to save passwords. This preference's
   * value is a boolean, defaulting to <code>true</code>.
   */
  public var passwordSavingEnabled: ChromeSetting

  /**
   * If enabled, Chrome does its best to protect you from phishing and malware. This preference's
   * value is a boolean, defaulting to <code>true</code>.
   */
  public var safeBrowsingEnabled: ChromeSetting

  /**
   * If enabled, Chrome will send additional information to Google when SafeBrowsing blocks a page,
   * such as the content of the blocked page. This preference's value is a boolean, defaulting to
   * <code>false</code>.
   */
  public var safeBrowsingExtendedReportingEnabled: ChromeSetting

  /**
   * If enabled, Chrome sends the text you type into the Omnibox to your default search engine,
   * which provides predictions of websites and searches that are likely completions of what you've
   * typed so far. This preference's value is a boolean, defaulting to <code>true</code>.
   */
  public var searchSuggestEnabled: ChromeSetting

  /**
   * If enabled, Chrome uses a web service to help correct spelling errors. This preference's value
   * is a boolean, defaulting to <code>false</code>.
   */
  public var spellingServiceEnabled: ChromeSetting

  /**
   * If enabled, Chrome offers to translate pages that aren't in a language you read. This
   * preference's value is a boolean, defaulting to <code>true</code>.
   */
  public var translationServiceEnabled: ChromeSetting
}
