import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
  id("org.jetbrains.kotlin.jvm") version "1.9.0"

  // Apply the application plugin to add support for building a CLI application in Java.
  java
}

repositories {
  // Use Maven Central for resolving dependencies.
  mavenCentral()
}

java {
  sourceCompatibility = JavaVersion.VERSION_20
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(20))
  }
}

tasks.named<KotlinCompile>("compileKotlin") {
  kotlinOptions {
    jvmTarget = "20"
    freeCompilerArgs += "-Xjsr305=strict"
  }
}
