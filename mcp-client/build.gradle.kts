plugins {
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("io.ktor:ktor-client-core:3.1.3")
    implementation("io.ktor:ktor-client-websockets:3.1.3")
    implementation("io.ktor:ktor-client-cio:3.1.3")
}
