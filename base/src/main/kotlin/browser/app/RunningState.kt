package browser.app

import kotlin.String

public enum class RunningState(
  private val `value`: String,
) {
  running("running"),
  cannot_run("cannot_run"),
  ready_to_run("ready_to_run"),
  ;

  public override fun toString(): String = value
}
