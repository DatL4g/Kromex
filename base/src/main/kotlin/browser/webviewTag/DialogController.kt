@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Interface attached to <code>dialog</code> DOM events.
 */
public external interface DialogController {
  /**
   * Accept the dialog. Equivalent to clicking OK in an <code>alert</code>, <code>confirm</code>, or
   * <code>prompt</code> dialog.
   *
   * @param response The response string to provide to the guest when accepting a
   * <code>prompt</code> dialog.
   */
  public fun ok(response: String? = definedExternally): Nothing

  /**
   * Reject the dialog. Equivalent to clicking Cancel in a <code>confirm</code> or
   * <code>prompt</code> dialog.
   */
  public fun cancel(): Nothing
}
