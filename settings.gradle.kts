pluginManagement {
  val kotlinVersion: String by settings
  plugins {
    kotlin("jvm").version(kotlinVersion)
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

