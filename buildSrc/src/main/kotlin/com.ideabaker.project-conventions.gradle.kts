import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm")
  java
}

repositories {
  mavenCentral()
}

tasks.withType<Test> {
  useJUnitPlatform()
}

kotlin {
  compilerOptions {
    jvmTarget.set(JvmTarget.JVM_20)
    freeCompilerArgs.add("-Xjsr305=strict")
  }
}

java {
  sourceCompatibility = JavaVersion.VERSION_20
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(20))
  }
  withJavadocJar()
}


