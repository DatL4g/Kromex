import common.collect

fun main() {
    browser.runtime.getPlatformInfo().collect {
        console.log(it)
    }
}