package browser.tts

import kotlin.String

public enum class EventType(
  private val `value`: String,
) {
  start("start"),
  end("end"),
  word("word"),
  sentence("sentence"),
  marker("marker"),
  interrupted("interrupted"),
  cancelled("cancelled"),
  error("error"),
  pause("pause"),
  resume("resume"),
  ;

  public override fun toString(): String = value
}
