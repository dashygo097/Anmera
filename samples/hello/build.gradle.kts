plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "io.github.dashygo097.anmera.samples.hello"
    compileSdk = 35

    defaultConfig {
        applicationId = "io.github.dashygo097.anmera.samples.hello"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

kotlin {
    jvmToolchain(17)
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

dependencies {
    implementation(project(":anmera"))

    testImplementation(libs.junit.jupiter)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}
