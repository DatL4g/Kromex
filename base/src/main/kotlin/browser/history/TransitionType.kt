package browser.history

import kotlin.String

/**
 * The <a href='#transition_types'>transition type</a> for this visit from its referrer.
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
  auto_toplevel("auto_toplevel"),
  form_submit("form_submit"),
  reload("reload"),
  keyword("keyword"),
  keyword_generated("keyword_generated"),
  ;

  public override fun toString(): String = value
}
