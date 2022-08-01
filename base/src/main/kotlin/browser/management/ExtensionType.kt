package browser.management

import kotlin.String

/**
 * The type of this extension, app, or theme.
 */
public enum class ExtensionType(
  private val `value`: String,
) {
  extension("extension"),
  hosted_app("hosted_app"),
  packaged_app("packaged_app"),
  legacy_packaged_app("legacy_packaged_app"),
  theme("theme"),
  login_screen_extension("login_screen_extension"),
  ;

  public override fun toString(): String = value
}
