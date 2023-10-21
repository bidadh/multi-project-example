import com.ideabaker.samples.gradle.plugins.StringDiffPlugin
import com.ideabaker.samples.gradle.plugins.StringDiffPluginExtension
import com.ideabaker.samples.gradle.plugins.diff.DiffPluginExtension

plugins {
  libPlugin()
}

apply<StringDiffPlugin>()

configure<DiffPluginExtension> {
  string1.set("Hi")
  string2.set("Gradle")
}

configure<StringDiffPluginExtension> {
  string1.set("Hi")
  string2.set("Gradle")
}
