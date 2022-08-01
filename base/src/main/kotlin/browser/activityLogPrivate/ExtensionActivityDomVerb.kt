package browser.activityLogPrivate

import kotlin.String

public enum class ExtensionActivityDomVerb(
  private val `value`: String,
) {
  getter("getter"),
  setter("setter"),
  method("method"),
  inserted("inserted"),
  xhr("xhr"),
  webrequest("webrequest"),
  modified("modified"),
  ;

  public override fun toString(): String = value
}
