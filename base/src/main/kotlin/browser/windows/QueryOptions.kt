@file:JsModule("webextension-polyfill")
@file:JsQualifier("windows")

package browser.windows

public external interface QueryOptions {
  /**
   * If true, the $(ref:windows.Window) object has a <var>tabs</var> property that contains a list
   * of the $(ref:tabs.Tab) objects. The <code>Tab</code> objects only contain the <code>url</code>,
   * <code>pendingUrl</code>, <code>title</code>, and <code>favIconUrl</code> properties if the
   * extension's manifest file includes the <code>"tabs"</code> permission.
   */
  public var populate: Boolean?

  /**
   * If set, the $(ref:windows.Window) returned is filtered based on its type. If unset, the default
   * filter is set to <code>['normal', 'popup']</code>.
   */
  public var windowTypes: Array<WindowType>?
}
