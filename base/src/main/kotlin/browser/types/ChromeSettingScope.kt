package browser.types

import kotlin.String

/**
 * The scope of the ChromeSetting. One of<ul><li><var>regular</var>: setting for the regular profile
 * (which is inherited by the incognito profile if not overridden
 * elsewhere),</li><li><var>regular_only</var>: setting for the regular profile only (not inherited by
 * the incognito profile),</li><li><var>incognito_persistent</var>: setting for the incognito profile
 * that survives browser restarts (overrides regular
 * preferences),</li><li><var>incognito_session_only</var>: setting for the incognito profile that can
 * only be set during an incognito session and is deleted when the incognito session ends (overrides
 * regular and incognito_persistent preferences).</li></ul>
 */
public enum class ChromeSettingScope(
  private val `value`: String,
) {
  regular("regular"),
  regular_only("regular_only"),
  incognito_persistent("incognito_persistent"),
  incognito_session_only("incognito_session_only"),
  ;

  public override fun toString(): String = value
}
