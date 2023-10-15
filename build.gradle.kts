import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  idea
  java
  kotlin("jvm")
}

allprojects {
  apply {
    plugin("org.jetbrains.kotlin.jvm")
  }

  repositories {
    mavenCentral()
  }

  tasks.withType<KotlinCompile> {
    kotlinOptions {
      jvmTarget = "20"
      freeCompilerArgs += "-Xjsr305=strict"
    }
  }
}
