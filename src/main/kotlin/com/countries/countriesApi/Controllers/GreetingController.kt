package com.countries.countriesApi.Controllers

import com.countries.countriesApi.models.GreetModel
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GreetingController {

    @GetMapping("/greeting")
    fun greeting() : GreetModel{
        return GreetModel(1,"Hello World!")
    }

    @GetMapping("/showcountries")
    fun showcountries() : List<GreetModel> {
        val greetingsList = listOf<GreetModel>(
            GreetModel(1, "Hello"),
            GreetModel(2, "Salaam"),
            GreetModel(3, "Namaste"),
        )
        return greetingsList
    }
}