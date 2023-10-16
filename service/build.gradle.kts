import come.ideabaker.samples.gradle.tasks.StringDiffTask

plugins {
  projectPlugin()
}

tasks.register<StringDiffTask>("stringDiff") {
  string1.set("strin1")
  string2.set("string2")
}
