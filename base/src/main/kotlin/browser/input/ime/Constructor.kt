@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.input.ime

public inline fun KeyboardEvent(block: KeyboardEvent.() -> Unit): KeyboardEvent = (js("{}") as
    KeyboardEvent).apply(block)

public inline fun InputContext(block: InputContext.() -> Unit): InputContext = (js("{}") as
    InputContext).apply(block)

public inline fun MenuItem(block: MenuItem.() -> Unit): MenuItem = (js("{}") as
    MenuItem).apply(block)

public inline fun AssistiveWindowProperties(block: AssistiveWindowProperties.() -> Unit):
    AssistiveWindowProperties = (js("{}") as AssistiveWindowProperties).apply(block)

public inline fun MenuParameters(block: MenuParameters.() -> Unit): MenuParameters = (js("{}") as
    MenuParameters).apply(block)

public inline fun SetCompositionParameters(block: SetCompositionParameters.() -> Unit):
    SetCompositionParameters = (js("{}") as SetCompositionParameters).apply(block)

public inline fun ClearCompositionParameters(block: ClearCompositionParameters.() -> Unit):
    ClearCompositionParameters = (js("{}") as ClearCompositionParameters).apply(block)

public inline fun CommitTextParameters(block: CommitTextParameters.() -> Unit): CommitTextParameters
    = (js("{}") as CommitTextParameters).apply(block)

public inline fun SendKeyEventsParameters(block: SendKeyEventsParameters.() -> Unit):
    SendKeyEventsParameters = (js("{}") as SendKeyEventsParameters).apply(block)

public inline
    fun SetCandidateWindowPropertiesParameters(block: SetCandidateWindowPropertiesParameters.() -> Unit):
    SetCandidateWindowPropertiesParameters = (js("{}") as
    SetCandidateWindowPropertiesParameters).apply(block)

public inline fun SetCandidatesParameters(block: SetCandidatesParameters.() -> Unit):
    SetCandidatesParameters = (js("{}") as SetCandidatesParameters).apply(block)

public inline fun SetCursorPositionParameters(block: SetCursorPositionParameters.() -> Unit):
    SetCursorPositionParameters = (js("{}") as SetCursorPositionParameters).apply(block)

public inline
    fun SetAssistiveWindowPropertiesParameters(block: SetAssistiveWindowPropertiesParameters.() -> Unit):
    SetAssistiveWindowPropertiesParameters = (js("{}") as
    SetAssistiveWindowPropertiesParameters).apply(block)

public inline
    fun SetAssistiveWindowButtonHighlightedParameters(block: SetAssistiveWindowButtonHighlightedParameters.() -> Unit):
    SetAssistiveWindowButtonHighlightedParameters = (js("{}") as
    SetAssistiveWindowButtonHighlightedParameters).apply(block)

public inline
    fun DeleteSurroundingTextParameters(block: DeleteSurroundingTextParameters.() -> Unit):
    DeleteSurroundingTextParameters = (js("{}") as DeleteSurroundingTextParameters).apply(block)

public inline fun OnActivateListener(block: OnActivateListener.() -> Unit): OnActivateListener =
    (js("{}") as OnActivateListener).apply(block)

public inline fun OnDeactivatedListener(block: OnDeactivatedListener.() -> Unit):
    OnDeactivatedListener = (js("{}") as OnDeactivatedListener).apply(block)

public inline fun OnFocusListener(block: OnFocusListener.() -> Unit): OnFocusListener = (js("{}") as
    OnFocusListener).apply(block)

public inline fun OnBlurListener(block: OnBlurListener.() -> Unit): OnBlurListener = (js("{}") as
    OnBlurListener).apply(block)

public inline fun OnInputContextUpdateListener(block: OnInputContextUpdateListener.() -> Unit):
    OnInputContextUpdateListener = (js("{}") as OnInputContextUpdateListener).apply(block)

public inline fun OnKeyEventListener(block: OnKeyEventListener.() -> Unit): OnKeyEventListener =
    (js("{}") as OnKeyEventListener).apply(block)

public inline fun OnCandidateClickedListener(block: OnCandidateClickedListener.() -> Unit):
    OnCandidateClickedListener = (js("{}") as OnCandidateClickedListener).apply(block)

public inline fun OnMenuItemActivatedListener(block: OnMenuItemActivatedListener.() -> Unit):
    OnMenuItemActivatedListener = (js("{}") as OnMenuItemActivatedListener).apply(block)

public inline
    fun OnSurroundingTextChangedListener(block: OnSurroundingTextChangedListener.() -> Unit):
    OnSurroundingTextChangedListener = (js("{}") as OnSurroundingTextChangedListener).apply(block)

public inline fun OnResetListener(block: OnResetListener.() -> Unit): OnResetListener = (js("{}") as
    OnResetListener).apply(block)

public inline
    fun OnAssistiveWindowButtonClickedListener(block: OnAssistiveWindowButtonClickedListener.() -> Unit):
    OnAssistiveWindowButtonClickedListener = (js("{}") as
    OnAssistiveWindowButtonClickedListener).apply(block)
