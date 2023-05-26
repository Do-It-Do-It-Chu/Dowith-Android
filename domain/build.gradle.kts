plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    id("kotlinx-serialization")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

kotlin {
    jvmToolchain(11)
}

dependencies {

    // inject
    implementation("javax.inject:javax.inject:1")

    // serialization
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")
}