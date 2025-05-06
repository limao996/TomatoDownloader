plugins {
    kotlin("jvm") version "2.1.20"
}

group = "org.limao996"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.documentnode:epub4j-core:4.2.1") {
        exclude("xmlpull")
    }
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("org.jsoup:jsoup:1.20.1")
    implementation("com.alibaba.fastjson2:fastjson2-kotlin:2.0.57")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}