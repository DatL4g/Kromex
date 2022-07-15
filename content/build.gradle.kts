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
    implementation(project(":base"))
}

kotlin {
    js(LEGACY) {
        binaries.executable()
        browser {
            webpackTask {
                outputFileName = "content_script.js"
                sourceMaps = false
                report = true
            }
            distribution {
                directory = File("$projectDir/../build/distributions/")
            }
        }
    }
}
