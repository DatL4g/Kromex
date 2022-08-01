package browser.runtime

import kotlin.String

/**
 * The reason that this event is being dispatched.
 */
public enum class OnInstalledReason(
  private val `value`: String,
) {
  install("install"),
  update("update"),
  chrome_update("chrome_update"),
  shared_module_update("shared_module_update"),
  ;

  public override fun toString(): String = value
}
