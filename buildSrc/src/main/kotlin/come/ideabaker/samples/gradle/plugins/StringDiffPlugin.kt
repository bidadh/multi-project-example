package come.ideabaker.samples.gradle.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.provider.Property
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.register

/**
 *
 * @author Arthur Kazemi<bidadh@gmail.com>
 * @since 17/10/2023 06:35
 */
class StringDiffPlugin: Plugin<Project> {
  override fun apply(project: Project) {
    val extension = project.extensions.create<StringDiffPluginExtension>("stringDiffConfig")
  
    project.tasks.register<StringDiffTask>("stringDiff") {
      string1.set(extension.string1)
      string2.set(extension.string2)
    }
  }
}

interface StringDiffPluginExtension {
  val string1: Property<String>
  val string2: Property<String>
}
