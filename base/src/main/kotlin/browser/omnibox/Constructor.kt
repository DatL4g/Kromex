@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.omnibox

public inline fun MatchClassification(block: MatchClassification.() -> Unit): MatchClassification =
    (js("{}") as MatchClassification).apply(block)

public inline fun SuggestResult(block: SuggestResult.() -> Unit): SuggestResult = (js("{}") as
    SuggestResult).apply(block)

public inline fun DefaultSuggestResult(block: DefaultSuggestResult.() -> Unit): DefaultSuggestResult
    = (js("{}") as DefaultSuggestResult).apply(block)

public inline fun OnInputChangedListener(block: OnInputChangedListener.() -> Unit):
    OnInputChangedListener = (js("{}") as OnInputChangedListener).apply(block)

public inline fun OnInputEnteredListener(block: OnInputEnteredListener.() -> Unit):
    OnInputEnteredListener = (js("{}") as OnInputEnteredListener).apply(block)

public inline fun OnDeleteSuggestionListener(block: OnDeleteSuggestionListener.() -> Unit):
    OnDeleteSuggestionListener = (js("{}") as OnDeleteSuggestionListener).apply(block)
