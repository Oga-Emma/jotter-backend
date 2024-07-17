package app.seven.jotter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JotterApplication

fun main(args: Array<String>) {
	runApplication<JotterApplication>(*args)
}
