plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.optimisedroute"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.optimisedroute"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    //<!-- Start -->
    // Add dependencies for maps and network requests
    implementation(libs.osmdroid.android) // For OpenStreetMap
    implementation(libs.retrofit) // For making API calls
    implementation(libs.converter.gson) // For JSON response parsing
//    implementation(libs.okhttp) // For HTTP requests
    implementation(libs.retrofit) // For making API calls
    implementation(libs.converter.gson) // For JSON response parsing
    implementation(libs.okhttp.v490)  // OkHttp for HTTP requests

    //<!-- End -->
}