object Dependencies {
    object AndroidXCore {
        private const val version = "1.7.0"
        const val core = "androidx.core:core-ktx:$version"
    }

    object AndroidXAppCompat {
        private const val version = "1.4.1"
        const val appcompat = "androidx.appcompat:appcompat:$version"
    }

    object AndroidXConstraintLayout {
        private const val version = "2.1.3"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:$version"
    }

    object AndroidMaterial {
        private const val version = "1.5.0"
        const val material = "com.google.android.material:material:$version"
    }

    object JUnit {
        private const val version = "4.13.2"
        const val junit = "junit:junit:$version"

        private const val versionExt = "1.1.3"
        const val junitExt = "androidx.test.ext:junit:$versionExt"
    }

    object Espresso {
        private const val version = "3.4.0"
        const val core = "androidx.test.espresso:espresso-core:$version"
    }
}