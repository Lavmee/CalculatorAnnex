plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {

    compileSdk = Dependencies.Versions.androidCompileSdkVersion

    defaultConfig {
        multiDexEnabled = true
        applicationId = "com.annexflow.calculatorannex"
        minSdk = Dependencies.Versions.minSdkVersion
        targetSdk = Dependencies.Versions.targetSdkVersion
        versionCode = Dependencies.Versions.appVersionCode
        versionName = Dependencies.generateVersionName()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
            isShrinkResources = false
            isDebuggable = true
            applicationIdSuffix = ".debug"
            versionNameSuffix = "-DEBUG"
            signingConfig = signingConfigs.getByName("debug")
        }
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            setProguardFiles(
                listOf(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            )
        }
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    //Android
    implementation(Dependencies.Libraries.android_core_ktx)
    implementation(Dependencies.Libraries.constraintLayout)
    implementation(Dependencies.Libraries.appcompat)
    implementation(Dependencies.Libraries.material)
    implementation(Dependencies.Libraries.lifecycle_livedata_ktx)
    implementation(Dependencies.Libraries.lifecycle_runtime_ktx)
    implementation(Dependencies.Libraries.lifecycle_common)
    implementation(Dependencies.Libraries.lifecycle_viewmodel_ktx)
    implementation(Dependencies.Libraries.fragment_ktx)
    implementation(Dependencies.Libraries.recyclerview)
    //UI
    implementation(Dependencies.Libraries.glide)
    kapt(Dependencies.Libraries.glide_compiler)
    implementation(Dependencies.Libraries.lottie)

    testImplementation(Dependencies.Libraries.junit)
    androidTestImplementation(Dependencies.Libraries.test_ext_junit)
    androidTestImplementation(Dependencies.Libraries.espresso_core)
}