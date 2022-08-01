@file:JsModule("webextension-polyfill")
@file:JsQualifier("activityLogPrivate")

package browser.activityLogPrivate

public external interface OtherProperty {
  public var prerender: Boolean?

  public var domVerb: ExtensionActivityDomVerb?

  public var webRequest: String?

  public var extra: String?
}
