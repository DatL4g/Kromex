@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

import browser.events.Event
import kotlin.js.Promise

/**
 * Set the current composition. If this extension does not own the active IME, this fails.
 *
 * @return Called when the operation completes with a boolean indicating if the text was accepted or
 * not. On failure, $(ref:runtime.lastError) is set.
 */
public external fun setComposition(parameters: SetCompositionParameters): Promise<Boolean>

/**
 * Clear the current composition. If this extension does not own the active IME, this fails.
 *
 * @return Called when the operation completes with a boolean indicating if the text was accepted or
 * not. On failure, $(ref:runtime.lastError) is set.
 */
public external fun clearComposition(parameters: ClearCompositionParameters): Promise<Boolean>

/**
 * Commits the provided text to the current input.
 *
 * @return Called when the operation completes with a boolean indicating if the text was accepted or
 * not. On failure, $(ref:runtime.lastError) is set.
 */
public external fun commitText(parameters: CommitTextParameters): Promise<Boolean>

/**
 * Sends the key events.  This function is expected to be used by virtual keyboards.  When key(s) on
 * a virtual keyboard is pressed by a user, this function is used to propagate that event to the
 * system.
 *
 * @return Called when the operation completes.
 */
public external fun sendKeyEvents(parameters: SendKeyEventsParameters): Promise<Nothing>

/**
 * Hides the input view window, which is popped up automatically by system. If the input view window
 * is already hidden, this function will do nothing.
 */
public external fun hideInputView(): Nothing

/**
 * Sets the properties of the candidate window. This fails if the extension doesn't own the active
 * IME
 *
 * @return Called when the operation completes.
 */
public external
    fun setCandidateWindowProperties(parameters: SetCandidateWindowPropertiesParameters):
    Promise<Boolean>

/**
 * Sets the current candidate list. This fails if this extension doesn't own the active IME
 *
 * @return Called when the operation completes.
 */
public external fun setCandidates(parameters: SetCandidatesParameters): Promise<Boolean>

/**
 * Set the position of the cursor in the candidate window. This is a no-op if this extension does
 * not own the active IME.
 *
 * @return Called when the operation completes
 */
public external fun setCursorPosition(parameters: SetCursorPositionParameters): Promise<Boolean>

/**
 * Shows/Hides an assistive window with the given properties.
 *
 * @return Called when the operation completes.
 */
public external
    fun setAssistiveWindowProperties(parameters: SetAssistiveWindowPropertiesParameters):
    Promise<Boolean>

/**
 * Highlights/Unhighlights a button in an assistive window.
 *
 * @return Called when the operation completes. On failure, $(ref:runtime.lastError) is set.
 */
public external
    fun setAssistiveWindowButtonHighlighted(parameters: SetAssistiveWindowButtonHighlightedParameters):
    Promise<Nothing>

/**
 * Adds the provided menu items to the language menu when this IME is active.
 */
public external fun setMenuItems(parameters: MenuParameters): Promise<Nothing>

/**
 * Updates the state of the MenuItems specified
 *
 * @return Called when the operation completes
 */
public external fun updateMenuItems(parameters: MenuParameters): Promise<Nothing>

/**
 * Deletes the text around the caret.
 *
 * @return Called when the operation completes.
 */
public external fun deleteSurroundingText(parameters: DeleteSurroundingTextParameters):
    Promise<Nothing>

/**
 * Indicates that the key event received by onKeyEvent is handled.  This should only be called if
 * the onKeyEvent listener is asynchronous.
 *
 * @param requestId Request id of the event that was handled.  This should come from
 * keyEvent.requestId
 * @param response True if the keystroke was handled, false if not
 */
public external fun keyEventHandled(requestId: String, response: Boolean): Nothing

/**
 * This event is sent when an IME is activated. It signals that the IME will be receiving onKeyPress
 * events.
 */
public external val onActivate: Event<OnActivateListener, Unit> = definedExternally

/**
 * This event is sent when an IME is deactivated. It signals that the IME will no longer be
 * receiving onKeyPress events.
 */
public external val onDeactivated: Event<OnDeactivatedListener, Unit> = definedExternally

/**
 * This event is sent when focus enters a text box. It is sent to all extensions that are listening
 * to this event, and enabled by the user.
 */
public external val onFocus: Event<OnFocusListener, Unit> = definedExternally

/**
 * This event is sent when focus leaves a text box. It is sent to all extensions that are listening
 * to this event, and enabled by the user.
 */
public external val onBlur: Event<OnBlurListener, Unit> = definedExternally

/**
 * This event is sent when the properties of the current InputContext change, such as the the type.
 * It is sent to all extensions that are listening to this event, and enabled by the user.
 */
public external val onInputContextUpdate: Event<OnInputContextUpdateListener, Unit> =
    definedExternally

/**
 * Fired when a key event is sent from the operating system. The event will be sent to the extension
 * if this extension owns the active IME. The listener function should return true if the event was
 * handled false if it was not.  If the event will be evaluated asynchronously, this function must
 * return undefined and the IME must later call keyEventHandled() with the result.
 */
public external val onKeyEvent: Event<OnKeyEventListener, Boolean?> = definedExternally

/**
 * This event is sent if this extension owns the active IME.
 */
public external val onCandidateClicked: Event<OnCandidateClickedListener, Unit> = definedExternally

/**
 * Called when the user selects a menu item
 */
public external val onMenuItemActivated: Event<OnMenuItemActivatedListener, Unit> =
    definedExternally

/**
 * Called when the editable string around caret is changed or when the caret position is moved. The
 * text length is limited to 100 characters for each back and forth direction.
 */
public external val onSurroundingTextChanged: Event<OnSurroundingTextChangedListener, Unit> =
    definedExternally

/**
 * This event is sent when chrome terminates ongoing text input session.
 */
public external val onReset: Event<OnResetListener, Unit> = definedExternally

/**
 * This event is sent when a button in an assistive window is clicked.
 */
public external val onAssistiveWindowButtonClicked:
    Event<OnAssistiveWindowButtonClickedListener, Unit> = definedExternally
