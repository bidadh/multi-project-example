val kotlinVersion: String = "1.9.0"
plugins {
  `kotlin-dsl`
  kotlin("jvm") version "1.9.0"
}

repositories {
  mavenCentral()
  gradlePluginPortal()
}

dependencies {
  implementation(
    group = "org.jetbrains.kotlin.jvm",
    name = "org.jetbrains.kotlin.jvm.gradle.plugin",
    version = kotlinVersion
  )
}
