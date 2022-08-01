package browser.terminalPrivate

import kotlin.String

/**
 * Type of the output stream from which output came. When process exits, output type will be set to
 * exit
 */
public enum class OutputType(
  private val `value`: String,
) {
  stdout("stdout"),
  stderr("stderr"),
  exit("exit"),
  ;

  public override fun toString(): String = value
}
