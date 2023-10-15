import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  idea
  java
  id("org.jetbrains.kotlin.jvm")
}

allprojects {
  apply {
    plugin("org.jetbrains.kotlin.jvm")
  }

  repositories {
    mavenCentral()
  }

  java {
    sourceCompatibility = JavaVersion.VERSION_20
    toolchain {
      languageVersion.set(JavaLanguageVersion.of(20))
    }
  }

  tasks.withType<KotlinCompile> {
    kotlinOptions {
      jvmTarget = "20"
      freeCompilerArgs += "-Xjsr305=strict"
    }
  }

  tasks.withType<Test> {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
  }
}
