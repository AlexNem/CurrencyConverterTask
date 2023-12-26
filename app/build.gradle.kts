plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.test.currencyconvertertask"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.test.currencyconvertertask"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

     val material3Version = "1.1.2"
     val materialVersion = "1.5.4"
     val koinVersion = "3.1.5"
     val ktorVersion = "2.3.5"
     val serializationVersion = "1.6.0"
     val mviKotlin_version = "2.0.4"
     val composeVersion = "1.5.4"
     val composeNavigationVersion = "2.7.6"
     val coreKtxVersion = "1.12.0"
     val activityComposeVersion = "1.8.2"
     val lifecycleVersion = "2.6.2"
     val runtimeComposeVersion = "2.7.0-rc02"
     val retrofitVersion = "2.9.0"
     val hiltNavigationComposeVersion = "1.0.0"
     val timberVersion = "5.0.1"
     val okhttp3Version = "4.10.0"
     val gsonVersion = "2.9.1"
     val coilVersion = "2.2.2"
     val coroutinesVersion = "1.7.3"
     val leakcanaryVersion = "2.9.1"
     val espressoCoreVersion = "3.5.0"
     val jUnitVersion = "4.13.2"
     val jUnitExtVersion = "1.1.4"

    //Ktx
    implementation("androidx.core:core-ktx:${coreKtxVersion}")
    //Compose
    implementation("androidx.compose.material3:material3:${material3Version}")
    implementation("androidx.activity:activity-compose:${activityComposeVersion}")
    implementation("androidx.compose.ui:ui:${composeVersion}")
    implementation("androidx.navigation:navigation-compose:${composeNavigationVersion}")
    implementation("androidx.compose.ui:ui-tooling-preview:${composeVersion}")
    //ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:${lifecycleVersion}")
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:${lifecycleVersion}")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:${lifecycleVersion}")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:${runtimeComposeVersion}")
    implementation("androidx.lifecycle:lifecycle-service:${lifecycleVersion}")
    //Koin
    implementation("io.insert-koin:koin-androidx-compose:${koinVersion}")
    //MVI Kotlin
    implementation("com.arkivanov.mvikotlin:mvikotlin:${mviKotlin_version}")
    implementation("com.arkivanov.mvikotlin:mvikotlin-main:${mviKotlin_version}")
    implementation("com.arkivanov.mvikotlin:mvikotlin-logging:${mviKotlin_version}")
    implementation("com.arkivanov.mvikotlin:mvikotlin-timetravel:${mviKotlin_version}")
    implementation("com.arkivanov.mvikotlin:mvikotlin-extensions-coroutines:${mviKotlin_version}")
    //Logger
    implementation("com.jakewharton.timber:timber:${timberVersion}")
    //Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:${coroutinesVersion}")
    //Network
    implementation("io.ktor:ktor-client-core:${ktorVersion}")
    implementation("io.ktor:ktor-client-cio:${ktorVersion}")
    implementation("io.ktor:ktor-client-logging:${ktorVersion}")
    implementation("io.ktor:ktor-client-content-negotiation:${ktorVersion}")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:${serializationVersion}")
}