plugins {
    id("com.android.application")
    kotlin("android")
}

repositories {
    google()
    mavenCentral()
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.annexflow.calculatorannex"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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
    implementation(Dependencies.AndroidXCore.core)

    implementation(Dependencies.AndroidXConstraintLayout.constraintLayout)
    implementation(Dependencies.AndroidXAppCompat.appcompat)
    implementation(Dependencies.AndroidMaterial.material)

    testImplementation(Dependencies.JUnit.junit)
    androidTestImplementation(Dependencies.JUnit.junitExt)
    androidTestImplementation(Dependencies.Espresso.core)
}