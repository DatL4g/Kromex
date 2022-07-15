import browser.action.BadgeDetails
import browser.tabs.QueryInfo
import common.collect
import kotlinx.browser.document
import kotlinx.browser.window

fun main() {
    browser.action.setBadgeText(BadgeDetails {
        text = "Test"
    })
    browser.tabs.query(QueryInfo {
        active = true
        currentWindow = true
    }).collect {
        val activeTab = it?.firstOrNull()
        console.log(activeTab)
    }
    window.onload = {
        browser.tabs.captureVisibleTab()?.collect {
            document.getElementById("capture")?.setAttribute("src", it.toString())
        }
    }
    browser.tabs.onZoomChange.addListener {
        console.log(it)
    }
}