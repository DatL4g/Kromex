package browser.proxy

import kotlin.String

public enum class Scheme(
  private val `value`: String,
) {
  http("http"),
  https("https"),
  quic("quic"),
  socks4("socks4"),
  socks5("socks5"),
  ;

  public override fun toString(): String = value
}
