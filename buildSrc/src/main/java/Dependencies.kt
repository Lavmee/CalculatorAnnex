import Dependencies.Versions.appVersionCode

object Dependencies {

    object Versions {
        const val appVersionCode = 1
        const val androidCompileSdkVersion = 31
        const val targetSdkVersion = 31
        const val minSdkVersion = 23

        const val supportVersion = "1.4.1"
        const val constraintLayoutVersion = "2.1.3"
        const val materialVersion = "1.5.0"
        const val coreKtxVersion = "1.7.0"
        const val lifecycleVersion = "2.4.0"
        const val fragmentExtVersion = "1.4.0"
        const val recyclerviewVersion = "1.2.1"
        const val lottieVersion = "4.2.2"
        const val glideVersion = "4.13.0"
        const val navVersion = "2.4.1"

        const val junitVersion = "4.13.2"
        const val testExtJunitVersion = "1.1.3"
        const val espressoVersion = "3.4.0"
    }

    object Libraries {
        const val appcompat =
            "androidx.appcompat:appcompat:${Versions.supportVersion}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
        const val material =
            "com.google.android.material:material:${Versions.materialVersion}"
        const val navigationFragment =
            "androidx.navigation:navigation-fragment-ktx:${Versions.navVersion}"
        const val navigationUI =
            "androidx.navigation:navigation-ui-ktx:${Versions.navVersion}"
        const val android_core_ktx =
            "androidx.core:core-ktx:${Versions.coreKtxVersion}"
        const val lifecycle_livedata_ktx =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"
        const val lifecycle_runtime_ktx =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleVersion}"
        const val lifecycle_common =
            "androidx.lifecycle:lifecycle-common:${Versions.lifecycleVersion}"
        const val lifecycle_viewmodel_ktx =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"
        const val recyclerview =
            "androidx.recyclerview:recyclerview:${Versions.recyclerviewVersion}"
        const val fragment_ktx =
            "androidx.fragment:fragment-ktx:${Versions.fragmentExtVersion}"
        const val glide = "com.github.bumptech.glide:glide:${Versions.glideVersion}"
        const val glide_compiler = "com.github.bumptech.glide:compiler:${Versions.glideVersion}"
        const val lottie = "com.airbnb.android:lottie:${Versions.lottieVersion}"

        const val junit = "junit:junit:${Versions.junitVersion}"
        const val test_ext_junit = "androidx.test.ext:junit:${Versions.testExtJunitVersion}"
        const val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"
    }

    fun generateVersionName(): String {
        val patch: Int = appVersionCode.rem(1000)
        val minor: Int = (appVersionCode / 1000).rem(1000)
        val major: Int = (appVersionCode / 1000000).rem(1000)

        return "$major.$minor.$patch"
    }

}