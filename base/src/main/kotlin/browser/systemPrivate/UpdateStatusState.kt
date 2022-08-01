package browser.systemPrivate

import kotlin.String

/**
 * State of system update.  NotAvailable when there is no available update or the update system is
 * in error state, Updating when a system update is in progress, NeedRestart when a system update is
 * finished and restart is needed.
 */
public enum class UpdateStatusState(
  private val `value`: String,
) {
  NotAvailable("NotAvailable"),
  Updating("Updating"),
  NeedRestart("NeedRestart"),
  ;

  public override fun toString(): String = value
}
