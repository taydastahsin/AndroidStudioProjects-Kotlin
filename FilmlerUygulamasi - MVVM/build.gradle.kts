// Top-level build file where you can add configuration options common to all sub-projects/modules.

// Navigation i,le veri geçişini sağlamak için kurduğumuz sürüm.
buildscript{
    dependencies{
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.3")
    }
}

plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}