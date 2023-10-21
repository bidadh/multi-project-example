import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

/**
 *
 * @author Arthur Kazemi<bidadh@gmail.com>
 * @since 15/10/2023 23:50
 */
fun PluginDependenciesSpec.libPlugin(): PluginDependencySpec =
  id("com.ideabaker.kotlin-lib-conventions")

fun PluginDependenciesSpec.appPlugin(): PluginDependencySpec =
  id("com.ideabaker.kotlin-app-conventions")
