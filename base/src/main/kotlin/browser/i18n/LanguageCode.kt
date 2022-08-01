@file:JsModule("webextension-polyfill")
@file:JsQualifier("i18n")

package browser.i18n

/**
 * An ISO language code such as <code>en</code> or <code>fr</code>. For a complete list of languages
 * supported by this method, see <a
 * href='http://src.chromium.org/viewvc/chrome/trunk/src/third_party/cld/languages/internal/languages.cc'>kLanguageInfoTable</a>.
 * For an unknown language, <code>und</code> will be returned, which means that [percentage] of the
 * text is unknown to CLD
 */
public external interface LanguageCode
