@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.options

import browser.tabs.properties.CreateGroupProperties

external interface GroupOptions {
    /**
     * The tab ID or list of tab IDs to add to the specified group.
     */
    var tabIds: Any

    /**
     * The ID of the group to add the tabs to.
     * If not specified, a new group will be created.
     */
    var groupId: Int?

    /**
     * Configurations for creating a group.
     * Cannot be used if groupId is already specified.
     */
    var createProperties: CreateGroupProperties?
}