@file:JsModule("webextension-polyfill")
@file:JsQualifier("omnibox")

package browser.omnibox

import browser.events.Event
import kotlin.js.Promise

/**
 * A callback passed to the onInputChanged event used for sending suggestions back to the browser.
 * @param suggestResults An array of suggest results
 */
public external fun sendSuggestions(requestId: Int, suggestResults: Array<SuggestResult>): Nothing

/**
 * Sets the description and styling for the default suggestion. The default suggestion is the text
 * that is displayed in the first suggestion row underneath the URL bar.
 *
 * @param suggestion A partial SuggestResult object, without the 'content' parameter.
 */
public external fun setDefaultSuggestion(suggestion: DefaultSuggestResult): Promise<Nothing>?

/**
 * User has started a keyword input session by typing the extension's keyword. This is guaranteed to
 * be sent exactly once per input session, and before any onInputChanged events.
 */
public external val onInputStarted: Event<Nothing, Unit> = definedExternally

/**
 * User has changed what is typed into the omnibox.
 */
public external val onInputChanged: Event<OnInputChangedListener, Promise<Array<SuggestResult>>> =
    definedExternally

/**
 * User has accepted what is typed into the omnibox.
 */
public external val onInputEntered: Event<OnInputEnteredListener, Unit> = definedExternally

/**
 * User has ended the keyword input session without accepting the input.
 */
public external val onInputCancelled: Event<Nothing, Unit> = definedExternally

/**
 * User has deleted a suggested result.
 */
public external val onDeleteSuggestion: Event<OnDeleteSuggestionListener, Unit> = definedExternally
