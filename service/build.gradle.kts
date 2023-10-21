import com.ideabaker.samples.gradle.plugins.StringDiffPlugin
import com.ideabaker.samples.gradle.plugins.StringDiffPluginExtension

plugins {
  projectPlugin()
}

apply<StringDiffPlugin>()

configure<StringDiffPluginExtension> {
  string1.set("Hi")
  string2.set("Gradle")
}
