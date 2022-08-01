@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

public external interface CaretBoundsProperty {
  public var x: Int

  public var y: Int

  public var w: Int

  public var h: Int
}
