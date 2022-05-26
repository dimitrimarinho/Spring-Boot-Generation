package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Indica que a classe abaixo é uma classe controladora
@RestController

//Serve para construir os endpoints da API
@RequestMapping("/hello")
public class HelloWorld {
	
	@GetMapping
	public String hello() {
		return "Hello World!";
	}
	
}