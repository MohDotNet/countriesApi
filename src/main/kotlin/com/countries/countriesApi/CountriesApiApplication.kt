package com.countries.countriesApi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CountriesApiApplication

fun main(args: Array<String>) {
	runApplication<CountriesApiApplication>(*args)
}
