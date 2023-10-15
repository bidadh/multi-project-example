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

tasks.withType<KotlinCompile> {
  kotlinOptions {
    jvmTarget = "20"
    freeCompilerArgs += "-Xjsr305=strict"
  }
}

java {
  sourceCompatibility = JavaVersion.VERSION_20
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(20))
  }
  withJavadocJar()
}


