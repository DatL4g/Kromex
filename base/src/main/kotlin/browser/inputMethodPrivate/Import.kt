@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

import browser.events.Event
import kotlin.js.Promise

/**
 * Gets configurations for input methods.
 *
 * @return Callback which is called with the config object.
 */
public external fun getInputMethodConfig(): Promise<GetInputMethodConfigReturn>

/**
 * Gets all enabled input methods, sorted in ascending order of their localized full display names,
 * according to the lexicographical order defined by the current system locale aka. display language.
 *
 * @return Callback which is called with the input method objects.
 */
public external fun getInputMethods(): Promise<Array<Any>>

/**
 * Gets the current input method.
 *
 * @return Callback which is called with the current input method.
 */
public external fun getCurrentInputMethod(): Promise<String>

/**
 * Sets the current input method.
 *
 * @param inputMethodId The input method ID to be set as current input method.
 * @return Callback which is called once the current input method is set. If unsuccessful
 * $(ref:runtime.lastError) is set.
 */
public external fun setCurrentInputMethod(inputMethodId: String): Promise<Nothing>

/**
 * Switches to the last used input method. If no last used input method, this is a no-op.
 *
 * @return Callback which is called once the input method is swapped (if applicable). If
 * unsuccessful $(ref:runtime.lastError) is set.
 */
public external fun switchToLastUsedInputMethod(): Promise<Nothing>

/**
 * Fetches a list of all the words currently in the dictionary.
 *
 * @return Callback which is called once the list of dictionary words are ready.
 */
public external fun fetchAllDictionaryWords(): Promise<Array<String>>

/**
 * Adds a single word to be stored in the dictionary.
 *
 * @param word A new word to add to the dictionary.
 * @return Callback which is called once the word is added. If unsuccessful $(ref:runtime.lastError)
 * is set.
 */
public external fun addWordToDictionary(word: String): Promise<Nothing>

/**
 * Gets whether the encrypt sync is enabled.
 *
 * @return Callback which is called to provide the result.
 */
public external fun getEncryptSyncEnabled(): Promise<Boolean>

/**
 * Sets the XKB layout for the given input method.
 *
 * @param xkb_name The XKB layout name.
 * @return Callback which is called when the layout is set.
 */
public external fun setXkbLayout(xkb_name: String): Promise<Nothing>

/**
 * Commits the text currently being composed without moving the selected text range. This is a no-op
 * if the context is incorrect.
 *
 * @return Called when the operation completes.
 */
public external fun finishComposingText(parameters: FinishComposingTextParameters): Promise<Nothing>

/**
 * Sets the selection range
 *
 * @return Called when the operation completes with a boolean indicating if the text was accepted or
 * not.
 */
public external fun setSelectionRange(parameters: SetSelectionRangeParameters): Promise<Boolean>

/**
 * Fires the input.ime.onMenuItemActivated event.
 *
 * @param engineID ID of the engine to use.
 * @param name Name of the MenuItem which was activated
 */
public external fun notifyImeMenuItemActivated(engineID: String, name: String): Nothing

/**
 * Shows the input view window. If the input view window is already shown, this function will do
 * nothing.
 *
 * @return Called when the operation completes.
 */
public external fun showInputView(): Promise<Nothing>

/**
 * Hides the input view window. If the input view window is already hidden, this function will do
 * nothing.
 *
 * @return Called when the operation completes.
 */
public external fun hideInputView(): Promise<Nothing>

/**
 * Opens the options page for the input method extension. If the input method does not have options,
 * this function will do nothing.
 *
 * @param inputMethodId ID of the input method to open options for.
 */
public external fun openOptionsPage(inputMethodId: String): Nothing

/**
 * Gets the composition bounds
 *
 * @return Callback which is called to provide the result
 */
public external fun getCompositionBounds(): Promise<Array<Any>>

/**
 * Gets the surrounding text of the current selection. WARNING: This could return a stale cache that
 * doesn't reflect reality, due to async between IMF and TextInputClient.
 *
 * @param beforeLength The number of characters before the current selection.
 * @param afterLength The number of characters after the current selection.
 * @return Callback which is called to provide the result
 */
public external fun getSurroundingText(beforeLength: Int, afterLength: Int):
    Promise<GetSurroundingTextReturn>

/**
 * Gets the current values of all settings for a particular input method
 *
 * @param engineID The ID of the engine (e.g. 'zh-t-i0-pinyin', 'xkb:us::eng')
 * @return Callback to receive the settings
 */
public external fun getSettings(engineID: String): Promise<InputMethodSettings?>

/**
 * Sets the value of all settings for a particular input method
 *
 * @param engineID The ID of the engine (e.g. 'zh-t-i0-pinyin', 'xkb:us::eng')
 * @param settings The settings to set
 * @return Callback to notify that the new value has been set
 */
public external fun setSettings(engineID: String, settings: InputMethodSettings): Promise<Nothing>

/**
 * (Deprecated) Set the composition range. If this extension does not own the active IME, this
 * fails. Use setComposingRange instead.
 *
 * @return Called when the operation completes with a boolean indicating if the text was accepted or
 * not. On failure, $(ref:runtime.lastError) is set.
 */
public external fun setCompositionRange(parameters: SetCompositionRangeParameters): Promise<Boolean>

/**
 * Sets the composing range. If this extension does not own the active IME, this fails.
 *
 * @return Called when the operation is complete. On failure, $(ref:runtime.lastError) is set.
 */
public external fun setComposingRange(parameters: SetComposingRangeParameters): Promise<Nothing>

/**
 * Get the autocorrected word's bounds. Returns an empty range if there is no autocorrected word.
 *
 * @return Called with the bounds of the autocorrect word when the operation completes. On failure,
 * $(ref:runtime.lastError) is set.
 */
public external fun getAutocorrectRange(parameters: GetAutocorrectRangeParameters):
    Promise<GetAutocorrectRangeReturn>

/**
 * Get the screen coordinates of the autocorrected word's bounds.
 *
 * @return Called with screen coordinates of the autocorrect word when the operation completes. On
 * failure, $(ref:runtime.lastError) is set.
 */
public external
    fun getAutocorrectCharacterBounds(parameters: GetAutocorrectCharacterBoundsParameters):
    Promise<GetAutocorrectCharacterBoundsReturn>

/**
 * Set the autocorrect range and autocorrect word. If this extension does not own the active IME,
 * this fails.
 *
 * @return Called when the operation completes. On failure, chrome.runtime.lastError is set.
 */
public external fun setAutocorrectRange(parameters: SetAutocorrectRangeParameters): Promise<Nothing>

/**
 * Resets the current engine to its initial state. Fires an OnReset event.
 */
public external fun reset(): Nothing

/**
 * Called after a word has been autocorrected to show some UI for autocorrect.
 */
public external fun onAutocorrect(parameters: OnAutocorrectParameters): Nothing

/**
 * Get the bounds of the current text field
 *
 * @return Called with screen coordinates of the text field when the operation completes. On
 * failure, $(ref:runtime.lastError) is set.
 */
public external fun getTextFieldBounds(parameters: GetTextFieldBoundsParameters):
    Promise<GetTextFieldBoundsReturn>

/**
 * Fired when the caret bounds change.
 */
public external val onCaretBoundsChanged: Event<OnCaretBoundsChangedListener, Unit> =
    definedExternally

/**
 * Fired when the input method is changed.
 */
public external val onChanged: Event<OnChangedListener, Unit> = definedExternally

/**
 * Fired when the composition bounds or cursor bounds are changed.
 */
public external val onCompositionBoundsChanged: Event<OnCompositionBoundsChangedListener, Unit> =
    definedExternally

/**
 * Fired when the custom spelling dictionary is loaded.
 */
public external val onDictionaryLoaded: Event<Nothing, Unit> = definedExternally

/**
 * Fired when words are added or removed from the custom spelling dictionary.
 */
public external val onDictionaryChanged: Event<OnDictionaryChangedListener, Unit> =
    definedExternally

/**
 * Fired when the IME menu is activated or deactivated.
 */
public external val onImeMenuActivationChanged: Event<OnImeMenuActivationChangedListener, Unit> =
    definedExternally

/**
 * Fired when the input method or the list of active input method IDs is changed.
 */
public external val onImeMenuListChanged: Event<Nothing, Unit> = definedExternally

/**
 * Fired when the input.ime.setMenuItems or input.ime.updateMenuItems API is called.
 */
public external val onImeMenuItemsChanged: Event<OnImeMenuItemsChangedListener, Unit> =
    definedExternally

/**
 * This event is sent when focus enters a text box. It is sent to all extensions that are listening
 * to this event, and enabled by the user.
 */
public external val onFocus: Event<OnFocusListener, Unit> = definedExternally

/**
 * This event is sent when a touch occurs in a text field. Should only happen after onFocus()
 */
public external val onTouch: Event<OnTouchListener, Unit> = definedExternally

/**
 * This event is sent when the settings for any input method changed. It is sent to all extensions
 * that are listening to this event, and enabled by the user.
 */
public external val onSettingsChanged: Event<OnSettingsChangedListener, Unit> = definedExternally

/**
 * This event is sent when the screen is being mirrored or the desktop is being cast.
 */
public external val onScreenProjectionChanged: Event<OnScreenProjectionChangedListener, Unit> =
    definedExternally

/**
 * This event is sent when a new set of suggestions has been generated
 */
public external val onSuggestionsChanged: Event<OnSuggestionsChangedListener, Unit> =
    definedExternally

/**
 * This event is sent when input method options are changed.
 */
public external val onInputMethodOptionsChanged: Event<OnInputMethodOptionsChangedListener, Unit> =
    definedExternally
