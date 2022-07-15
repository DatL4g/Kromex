import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnPlugin
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnRootExtension

plugins {
    kotlin("js") version "1.7.10"
}

group = "dev.datlag.kromex"
version = "1.0.0"

allprojects {
    repositories {
        google()
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
}

repositories {
    google()
    mavenLocal()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(kotlin("stdlib-js"))

    runtimeOnly(npm("webextension-polyfill", "0.9.0"))
    implementation(devNpm("webpack-bundle-analyzer", "4.5.0"))

    compileOnly(project(":background"))
    compileOnly(project(":content"))
    compileOnly(project(":popup"))
}

kotlin {
    js(LEGACY) {
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}

rootProject.plugins.withType<YarnPlugin> {
    rootProject.the<YarnRootExtension>().download = true
}

tasks {
    val extensionFolder = "build/extension"
    val copyBundleFile = register<Copy>("copyBundleFile") {
        from("build/distributions") {
            include("*.js")
        }
        into(extensionFolder)
    }
    val copyResources = register<Copy>("copyResources") {
        val resourceFolder = "src/main/resources"
        from(
            "$resourceFolder/manifest.json",
            "$resourceFolder/icons",
            "$resourceFolder/html",
            "$$resourceFolder/css"
        )
        into(extensionFolder)
    }
    val copyPolyfill = register<Copy>("copyPolyfill") {
        from("build/js/node_modules/webextension-polyfill/dist") {
            include("browser-polyfill.min.js")
            include("browser-polyfill.min.js.map")
        }
        into(extensionFolder)
    }
    val extension = register<Zip>("extension") {
        dependsOn(copyResources, copyPolyfill, copyBundleFile)
        from(extensionFolder)
        into("build")
    }
}