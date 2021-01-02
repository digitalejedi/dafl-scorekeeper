import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    compileSdkVersion(30)
    buildToolsVersion("29.0.3")

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    defaultConfig {
        applicationId = "dk.malone.dafl.scorekeeper"
        minSdkVersion(28)
        targetSdkVersion(30)
        versionCode = ProjectConstants.APP_VERSION_CODE
        versionName = ProjectConstants.APP_VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
    }

    sourceSets {
        map {
            it.java.srcDirs("src/${it.name}/kotlin", "src-gen/${it.name}/kotlin", "src-gen/${it.name}/java")
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    // Core
    implementation(kotlin("stdlib-jdk8", version = KotlinCompilerVersion.VERSION))
    implementation(group = "androidx.core", name = "core-ktx", version = Dependencies.AndroidX.CORE_KTX)
    implementation(group = "androidx.appcompat", name = "appcompat", version = Dependencies.AndroidX.APPCOMPAT)

    // Design
    implementation(group = "androidx.constraintlayout", name = "constraintlayout", version = Dependencies.AndroidX.CONSTRAINTLAYOUT)
    implementation(group = "com.google.android.material", name = "material", version = Dependencies.ComGoogleAndroidMaterial.MATERIAL)

    // Navigation
    implementation(group = "androidx.navigation", name = "navigation-fragment-ktx", version = Dependencies.AndroidX.NAVIGATION)
    implementation(group = "androidx.navigation", name = "navigation-ui-ktx", version = Dependencies.AndroidX.NAVIGATION)
}