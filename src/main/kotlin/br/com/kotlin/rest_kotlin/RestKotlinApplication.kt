package br.com.kotlin.rest_kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestKotlinApplication

fun main(args: Array<String>) {
	runApplication<RestKotlinApplication>(*args)
}
