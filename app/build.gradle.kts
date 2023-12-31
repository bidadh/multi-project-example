plugins {
  appPlugin()
}

dependencies {
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
  testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.3")
  testRuntimeOnly("org.junit.platform:junit-platform-launcher")
  implementation("com.google.guava:guava:32.1.1-jre")
  implementation(project(":service"))
}

application {
  mainClass.set("com.ideabaker.samples.gradle.AppKt")
}

diffConfig {
  string1.set("string1")
  string2.set("string2")
}
