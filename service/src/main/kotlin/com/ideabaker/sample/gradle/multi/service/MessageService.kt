package com.ideabaker.sample.gradle.multi.service

import kotlin.random.Random

/**
 *
 * @author Arthur Kazemi<bidadh@gmail.com>
 * @since 15/10/2023 19:53
 */
object MessageService {
  fun generateMessage(): String {
     val messages = listOf("Hello World!", "Gradle 4tw!")
    return messages[Random.nextInt(messages.size)]
  }
}
