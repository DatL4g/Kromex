plugins {
    kotlin("js")
}

repositories {
    google()
    mavenLocal()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:1.6.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.3")
}

kotlin {
    js(LEGACY) {
        binaries.executable()
        useCommonJs()
        browser {
            webpackTask {
                outputFileName = "base.js"
                sourceMaps = false
                report = true
            }
            distribution {
                directory = File("$projectDir/../build/distributions/")
            }
        }
    }
}
