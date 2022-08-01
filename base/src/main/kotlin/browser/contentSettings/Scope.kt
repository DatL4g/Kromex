package browser.contentSettings

import kotlin.String

/**
 * The scope of the ContentSetting. One of<br><var>regular</var>: setting for regular profile (which
 * is inherited by the incognito profile if not overridden
 * elsewhere),<br><var>incognito_session_only</var>: setting for incognito profile that can only be set
 * during an incognito session and is deleted when the incognito session ends (overrides regular
 * settings).
 */
public enum class Scope(
  private val `value`: String,
) {
  regular("regular"),
  incognito_session_only("incognito_session_only"),
  ;

  public override fun toString(): String = value
}
