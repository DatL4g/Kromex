import browser.action.SetBadgeTextDetails
import browser.tabs.QueryQueryInfo
import common.collect
import kotlinx.browser.document
import kotlinx.browser.window

fun main() {
    browser.action.setBadgeText(SetBadgeTextDetails {
        text = "Test"
    })
    browser.tabs.query(QueryQueryInfo {
        active = true
        currentWindow = true
    }).collect {
        val activeTab = it.firstOrNull()
        console.log(activeTab)
    }
    window.onload = {
        browser.tabs.captureVisibleTab().collect {
            document.getElementById("capture")?.setAttribute("src", it.toString())
        }
    }
    browser.tabs.onZoomChange.addListener {
        console.log(it)
    }
}