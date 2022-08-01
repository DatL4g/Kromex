import browser.runtime.PlatformOs
import common.collect

fun main() {
    browser.runtime.getPlatformInfo().collect {
        console.log(it)
        console.log(it.os == PlatformOs.linux)
        console.log(PlatformOs.valueOf(it.os.toString()) == PlatformOs.linux)
    }
}