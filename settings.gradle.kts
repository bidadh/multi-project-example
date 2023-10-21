pluginManagement {
  val kotlinVersion: String by settings
  val greetingVersion: String by settings
  plugins {
    kotlin("jvm").version(kotlinVersion)
    id("com.ideabaker.samples.gradle.plugins.greeting-plugin") version greetingVersion
  }

  repositories {
    maven {
      name = "github"
      url = uri("https://maven.pkg.github.com/bidadh/string-diff-plugin")
      credentials {
        username = "bidadh"
        password = System.getenv("GITHUB_TOKEN")
      }
    }
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

