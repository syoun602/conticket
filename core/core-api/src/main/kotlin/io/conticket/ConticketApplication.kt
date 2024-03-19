package io.conticket

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConticketApplication

fun main(args: Array<String>) {
    runApplication<ConticketApplication>(*args)
}
