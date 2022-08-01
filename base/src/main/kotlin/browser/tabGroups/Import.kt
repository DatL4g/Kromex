@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabGroups")

package browser.tabGroups

import browser.events.Event
import kotlin.js.Promise

/**
 * An ID that represents the absence of a group.
 */
public external var TAB_GROUP_ID_NONE: Any

/**
 * Retrieves details about the specified group.
 */
public external fun `get`(groupId: Int): Promise<TabGroup>

/**
 * Gets all groups that have the specified properties, or all groups if no properties are specified.
 */
public external fun query(queryInfo: QueryQueryInfo): Promise<Array<TabGroup>>

/**
 * Modifies the properties of a group. Properties that are not specified in
 * <var>updateProperties</var> are not modified.
 *
 * @param groupId The ID of the group to modify.
 */
public external fun update(groupId: Int, updateProperties: UpdateUpdateProperties):
    Promise<TabGroup?>?

/**
 * Moves the group and all its tabs within its window, or to a new window.
 *
 * @param groupId The ID of the group to move.
 */
public external fun move(groupId: Int, moveProperties: MoveMoveProperties): Promise<TabGroup?>?

/**
 * Fired when a group is created.
 */
public external val onCreated: Event<OnCreatedListener, Unit> = definedExternally

/**
 * Fired when a group is updated.
 */
public external val onUpdated: Event<OnUpdatedListener, Unit> = definedExternally

/**
 * Fired when a group is moved within a window. Move events are still fired for the individual tabs
 * within the group, as well as for the group itself. This event is not fired when a group is moved
 * between windows; instead, it will be removed from one window and created in another.
 */
public external val onMoved: Event<OnMovedListener, Unit> = definedExternally

/**
 * Fired when a group is closed, either directly by the user or automatically because it contained
 * zero tabs.
 */
public external val onRemoved: Event<OnRemovedListener, Unit> = definedExternally
