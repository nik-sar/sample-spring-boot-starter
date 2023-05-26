package ru.example.sample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SampleSpringBootStarterApplication

fun main(args: Array<String>) {
	runApplication<SampleSpringBootStarterApplication>(*args)
}
