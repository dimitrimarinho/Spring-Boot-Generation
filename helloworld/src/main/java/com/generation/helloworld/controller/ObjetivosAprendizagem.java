package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Indica que a classe abaixo é uma classe controladora
@RestController

@RequestMapping("/objetivosaprendizagem")
public class ObjetivosAprendizagem {
	
	@GetMapping
	public String objetivosaprendizagem() {
		return "- Aprender Spring Boot"
				+ "\nAprimorar os conhecimentos de MySQL";
	}
	
}