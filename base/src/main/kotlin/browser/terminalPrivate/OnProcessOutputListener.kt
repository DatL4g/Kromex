@file:JsModule("webextension-polyfill")
@file:JsQualifier("terminalPrivate")

package browser.terminalPrivate

import org.w3c.dom.BinaryType

/**
 * Fired when an opened process writes something to its output. Observing further process output
 * will be blocked until |ackOutput| for the terminal is called. Internally, first event argument will
 * be ID of the tab that contains terminal instance for which this event is intended. This argument
 * will be stripped before passing the event to the extension.
 */
public external interface OnProcessOutputListener {
  /**
   * Id of the process from which the output came.
   */
  public var id: String

  /**
   * Type of the output stream from which output came. When process exits, output type will be set
   * to exit
   */
  public var type: OutputType

  /**
   * Data that was written to the output stream.
   */
  public var `data`: BinaryType
}
