plugins {
    kotlin("jvm")
    id("application")
    kotlin("plugin.serialization") version "1.7.10"
}

repositories {
    google()
    mavenLocal()
    mavenCentral()
    gradlePluginPortal()
}

application {
    mainClass.set(project.properties.getOrDefault("mainClass", "GeneratorKt") as? String? ?: "GeneratorKt")
}

dependencies {
    implementation("com.squareup:kotlinpoet:1.12.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3")
    implementation("org.cuongnv.consoleformatter:consoleformatter:0.0.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.3")

    implementation("io.ktor:ktor-client-core:2.0.3")
    implementation("io.ktor:ktor-client-cio:2.0.3")
    implementation("io.ktor:ktor-client-content-negotiation:2.0.3")
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.0.3")
}

tasks.register<Delete>("cleanDirectory") {
    delete = setOf(File("./../popup/src/main/kotlin/browser"))
}

tasks.getByName("clean") {
    dependsOn(tasks.getByName("cleanDirectory"))
}
