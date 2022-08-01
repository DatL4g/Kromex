package browser.webNavigation

import kotlin.String

/**
 * Cause of the navigation. The same transition types as defined in the history API are used. These
 * are the same transition types as defined in the <a href="history#transition_types">history API</a>
 * except with <code>"start_page"</code> in place of <code>"auto_toplevel"</code> (for backwards
 * compatibility).
 */
public enum class TransitionType(
  private val `value`: String,
) {
  link("link"),
  typed("typed"),
  auto_bookmark("auto_bookmark"),
  auto_subframe("auto_subframe"),
  manual_subframe("manual_subframe"),
  generated("generated"),
  start_page("start_page"),
  form_submit("form_submit"),
  reload("reload"),
  keyword("keyword"),
  keyword_generated("keyword_generated"),
  ;

  public override fun toString(): String = value
}
