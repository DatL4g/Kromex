@file:JsModule("webextension-polyfill")
@file:JsQualifier("events")

package browser.events

/**
 * An object which allows the addition and removal of listeners for a Chrome event.
 */
external interface Event<T, R> {
    /**
     * Registers an event listener [callback] to an event.
     * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
     */
    fun addListener(callback: (T) -> R)

    /**
     * De-registers an event listener [callback] from an event.
     * @param callback Listener that shall be unregistered.
     */
    fun removeListener(callback: (T) -> R)

    /**
     * @param callback Listener whose registration status shall be tested.
     * @return True if [callback] is registered to the event.
     */
    fun hasListener(callback: (T) -> R): Boolean

    /**
     * @return True if any event listeners are registered to the event.
     */
    fun hasListeners(): Boolean

    /**
     * Registers rules to handle events.
     *
     * @param eventName Name of the event this function affects.
     * @param webViewInstanceId If provided, this is an integer that uniquely identifies the <webview> associated with this function call.
     * @param rules [Rule]s to be registered. These do not replace previously registered rules.
     * @param callback Called with registered rules. Rules that were registered, the optional parameters are filled with values.
     */
    fun <C, A> addRules(
        eventName: String? = definedExternally,
        webViewInstanceId: Int? = definedExternally,
        rules: Array<Rule<C, A>>,
        callback: ((Array<Rule<C, A>>) -> Unit)? = definedExternally
    )

    /**
     * Registers rules to handle events.
     *
     * @param rules [Rule]s to be registered. These do not replace previously registered rules.
     * @param callback Called with registered rules. Rules that were registered, the optional parameters are filled with values.
     */
    fun <C, A> addRules(
        rules: Array<Rule<C, A>>,
        callback: ((Array<Rule<C, A>>) -> Unit)? = definedExternally
    )

    /**
     * Returns currently registered rules.
     *
     * @param eventName Name of the event this function affects.
     * @param webViewInstanceId If provided, this is an integer that uniquely identifies the <webview> associated with this function call.
     * @param ruleIdentifiers If an array is passed, only rules with identifiers contained in this array are returned.
     * @param callback Called with registered rules. Rules that were registered, the optional parameters are filled with values.
     */
    fun <C, A> getRules(
        eventName: String? = definedExternally,
        webViewInstanceId: Int? = definedExternally,
        ruleIdentifiers: Array<String>? = definedExternally,
        callback: (Array<Rule<C, A>>) -> Unit
    )

    /**
     * Returns currently registered rules.
     *
     * @param ruleIdentifiers If an array is passed, only rules with identifiers contained in this array are returned.
     * @param callback Called with registered rules. Rules that were registered, the optional parameters are filled with values.
     */
    fun <C, A> getRules(
        ruleIdentifiers: Array<String>? = definedExternally,
        callback: (Array<Rule<C, A>>) -> Unit
    )

    /**
     * Unregisters currently registered rules.
     *
     * @param eventName Name of the event this function affects.
     * @param webViewInstanceId If provided, this is an integer that uniquely identifies the <webview> associated with this function call.
     * @param ruleIdentifiers If an array is passed, only rules with identifiers contained in this array are unregistered.
     * @param callback Called when rules were unregistered.
     */
    fun removeRules(
        eventName: String? = definedExternally,
        webViewInstanceId: Int? = definedExternally,
        ruleIdentifiers: Array<String>? = definedExternally,
        callback: (() -> Unit)? = definedExternally
    )

    /**
     * Unregisters currently registered rules.
     *
     * @param ruleIdentifiers If an array is passed, only rules with identifiers contained in this array are unregistered.
     * @param callback Called when rules were unregistered.
     */
    fun removeRules(
        ruleIdentifiers: Array<String>? = definedExternally,
        callback: (() -> Unit)? = definedExternally
    )
}