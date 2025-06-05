
plugins {
    kotlin("jvm") version "2.1.21" apply false
    id("com.github.ben-manes.versions") version "0.52.0"
}

allprojects {
    group = "com.example.mcp"
    version = "0.1.0"

    repositories {
        mavenCentral()
    }
}

tasks.named<com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask>("dependencyUpdates") {
    rejectVersionIf {
        isNonStable(candidate.version) && !isNonStable(currentVersion)
    }
}

fun isNonStable(version: String): Boolean {
    val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { version.uppercase().contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    return !stableKeyword && !regex.matches(version)
}
