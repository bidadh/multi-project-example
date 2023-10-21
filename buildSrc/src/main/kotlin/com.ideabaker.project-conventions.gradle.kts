import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
  kotlin("jvm")
  // once you include plugin in dependencies section you can apply without specifying the version!
  id("com.ideabaker.samples.gradle.plugins.greeting-plugin")
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


