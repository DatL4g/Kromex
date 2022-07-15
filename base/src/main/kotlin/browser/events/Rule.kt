@file:JsModule("webextension-polyfill")
@file:JsQualifier("events")

package browser.events

/**
 * Description of a declarative rule for handling events.
 */
external interface Rule<C, A> {
    /**
     * Optional identifier that allows referencing this rule.
     */
    var id: String?

    /**
     * Tags can be used to annotate rules and perform operations on sets of rules.
     */
    var tags: Array<String>?

    /**
     * List of conditions that can trigger the actions.
     */
    var conditions: Array<C>

    /**
     * List of actions that are triggered if one of the conditions is fulfilled.
     */
    var actions: Array<A>

    /**
     * Optional priority of this rule. Defaults to 100.
     */
    var priority: Int?
}