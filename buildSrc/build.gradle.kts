val kotlinVersion: String = "1.9.0"
val greetingVersion: String = "0.0.4"
plugins {
  `kotlin-dsl`
  kotlin("jvm") version "1.9.0"
  id("org.barfuin.gradle.taskinfo") version "2.1.0"
}

repositories {
  gradlePluginPortal()
  mavenCentral()
}

// (plugin) dependencies are required so that we can use in `project-convention` plugins etc.
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
  implementation(
    group = "org.barfuin.gradle.taskinfo",
    name = "org.barfuin.gradle.taskinfo.gradle.plugin",
    version = "2.1.0"
  )
}
