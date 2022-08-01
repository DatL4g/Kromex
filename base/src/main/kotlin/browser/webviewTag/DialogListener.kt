@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Fired when the guest window attempts to open a modal dialog via <code>window.alert</code>,
 * <code>window.confirm</code>, or <code>window.prompt</code>.<p>Handling this event will block the
 * guest process until each event listener returns or the <code>dialog</code> object becomes
 * unreachable (if <code>preventDefault()</code> was called.)</p><p>The default behavior is to cancel
 * the dialog.</p>
 */
public external interface DialogListener {
  /**
   * The type of modal dialog requested by the guest.
   */
  public var messageType: String

  /**
   * The text the guest attempted to display in the modal dialog.
   */
  public var messageText: String

  /**
   * An interface that can be used to respond to the guest's modal request.
   */
  public var dialog: DialogController
}
