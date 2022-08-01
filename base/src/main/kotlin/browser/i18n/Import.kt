@file:JsModule("webextension-polyfill")
@file:JsQualifier("i18n")

package browser.i18n

import kotlin.js.Promise

/**
 * Gets the accept-languages of the browser. This is different from the locale used by the browser;
 * to get the locale, use $(ref:i18n.getUILanguage).
 */
public external fun getAcceptLanguages(): Promise<Array<LanguageCode>>

/**
 * Gets the localized string for the specified message. If the message is missing, this method
 * returns an empty string (''). If the format of the <code>getMessage()</code> call is wrong &mdash;
 * for example, <em>messageName</em> is not a string or the <em>substitutions</em> array has more than
 * 9 elements &mdash; this method returns <code>undefined</code>.
 *
 * @param messageName The name of the message, as specified in the <a
 * href='i18n-messages'><code>messages.json</code></a> file.
 * @param substitutions Up to 9 substitution strings, if the message requires any.
 * @return Message localized for current locale.
 */
public external fun getMessage(
  messageName: String,
  substitutions: Any? = definedExternally,
  options: GetMessageOptions? = definedExternally,
): String

/**
 * Gets the browser UI language of the browser. This is different from
 * $(ref:i18n.getAcceptLanguages) which returns the preferred user languages.
 *
 * @return The browser UI language code such as en-US or fr-FR.
 */
public external fun getUILanguage(): String

/**
 * Detects the language of the provided text using CLD.
 *
 * @param text User input string to be translated.
 */
public external fun detectLanguage(text: String): Promise<DetectLanguageReturn>
