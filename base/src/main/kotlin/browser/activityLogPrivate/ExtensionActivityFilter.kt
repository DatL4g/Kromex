package browser.activityLogPrivate

import kotlin.String

/**
 * Exact match or any
 */
public enum class ExtensionActivityFilter(
  private val `value`: String,
) {
  api_call("api_call"),
  api_event("api_event"),
  content_script("content_script"),
  dom_access("dom_access"),
  dom_event("dom_event"),
  web_request("web_request"),
  any("any"),
  ;

  public override fun toString(): String = value
}
