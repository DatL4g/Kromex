@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

public external interface PinyinFuzzyConfigProperty {
  /**
   * Whether to enable an_ang fuzzy
   */
  public var an_ang: Boolean?

  /**
   * Whether to enable c_ch fuzzy
   */
  public var c_ch: Boolean?

  /**
   * Whether to enable en_eng fuzzy
   */
  public var en_eng: Boolean?

  /**
   * Whether to enable f_h fuzzy
   */
  public var f_h: Boolean?

  /**
   * Whether to enable ian_iang fuzzy
   */
  public var ian_iang: Boolean?

  /**
   * Whether to enable in_ing fuzzy
   */
  public var in_ing: Boolean?

  /**
   * Whether to enable k_g fuzzy
   */
  public var k_g: Boolean?

  /**
   * Whether to enable l_n fuzzy
   */
  public var l_n: Boolean?

  /**
   * Whether to enable r_l fuzzy
   */
  public var r_l: Boolean?

  /**
   * Whether to enable s_sh fuzzy
   */
  public var s_sh: Boolean?

  /**
   * Whether to enable uan_uang fuzzy
   */
  public var uan_uang: Boolean?

  /**
   * Whether to enable z_zh fuzzy
   */
  public var z_zh: Boolean?
}
