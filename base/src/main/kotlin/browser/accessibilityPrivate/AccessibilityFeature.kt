package browser.accessibilityPrivate

import kotlin.String

/**
 * Subset of accessibility features.
 */
public enum class AccessibilityFeature(
  private val `value`: String,
) {
  enhancedNetworkVoices("enhancedNetworkVoices"),
  googleTtsLanguagePacks("googleTtsLanguagePacks"),
  dictationPumpkinParsing("dictationPumpkinParsing"),
  ;

  public override fun toString(): String = value
}
