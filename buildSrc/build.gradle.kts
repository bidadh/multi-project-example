val kotlinVersion: String = "1.9.0"
val greetingVersion: String = "0.0.1"
plugins {
  `kotlin-dsl`
  kotlin("jvm") version "1.9.0"
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

dependencies {
  implementation(
    group = "org.jetbrains.kotlin.jvm",
    name = "org.jetbrains.kotlin.jvm.gradle.plugin",
    version = kotlinVersion
  )
  implementation(
    group = "com.ideabaker.samples.gradle.plugins",
    name = "greeting-plugin",
    version = greetingVersion
  )
}
