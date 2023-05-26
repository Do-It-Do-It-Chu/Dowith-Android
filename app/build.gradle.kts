@file:Suppress("UnstableApiUsage")

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.soopeach.dowith"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.soopeach.dowith"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.0"
    }

}

kotlin {
    jvmToolchain(11)
}

dependencies {

    implementation(project(":domain"))
    implementation(project(":data"))

    implementation("androidx.core:core-ktx:1.8.0")

    val composeBom = platform ("androidx.compose:compose-bom:2023.05.01")
    implementation(composeBom)
    androidTestImplementation(composeBom)

    // Material Design 3
    implementation("androidx.compose.material3:material3")

    // Material Design 2
    implementation("androidx.compose.material:material")

    implementation("androidx.compose.foundation:foundation")

    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")

    // Android Studio Preview support
    implementation("androidx.compose.ui:ui-tooling-preview")
    debugImplementation("androidx.compose.ui:ui-tooling")

    // Test
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // UI Test
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    // custom design system based on Foundation)
    implementation("androidx.compose.material:material-icons-core")
    // Optional - Add full set of material icons
    implementation("androidx.compose.material:material-icons-extended")
    // Optional - Add window size utils
    implementation("androidx.compose.material3:material3-window-size-class")

    // Optional - Integration with activities
    implementation("androidx.activity:activity-compose:1.7.1")
    // Optional - Integration with ViewModels
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")

    // hilt
    implementation("com.google.dagger:hilt-android:2.46.1")
    kapt("com.google.dagger:hilt-android-compiler:2.46.1")
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")

    // compose navigation
    val navVersion = "2.5.3"
    implementation("androidx.navigation:navigation-compose:$navVersion")

    // orbit
    val orbitVersion = "6.0.0"
    implementation("org.orbit-mvi:orbit-viewmodel:$orbitVersion")
    implementation("org.orbit-mvi:orbit-compose:$orbitVersion")
    // Tests
    testImplementation("org.orbit-mvi:orbit-test:$orbitVersion")

    // coil
    val coilVersion = "2.4.0"
    implementation("io.coil-kt:coil-compose:$coilVersion")

    implementation(platform("com.google.firebase:firebase-bom:32.0.0"))
    implementation("com.google.firebase:firebase-messaging-ktx:23.1.2")
    implementation("com.google.firebase:firebase-analytics-ktx")

}