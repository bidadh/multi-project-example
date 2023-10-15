pluginManagement {
  val kotlinVersion: String by settings
  plugins {
    id("org.jetbrains.kotlin.jvm").version(kotlinVersion)
    java
  }

  repositories {
    gradlePluginPortal()
  }
}

plugins {
  // Apply the foojay-resolver plugin to allow automatic download of JDKs
  id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}

rootProject.name = "multi-project-example"

val projects = listOf("app", "service")

include(projects)

