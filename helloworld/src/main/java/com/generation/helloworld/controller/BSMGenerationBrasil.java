package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Indica que a classe abaixo é uma classe controladora
@RestController

@RequestMapping("/bsmGenerationBrasil")
public class BSMGenerationBrasil {
	
	@GetMapping
	public String bsmGenerationBrasil() {
		String BSM = "Mentalidades: "
				+ "\nOrientação ao Futuro"
				+ "\nResponsabilidade Pessoal"
				+ "\nMentalidade de Crescimento"
				+ "\nPersistência"
				+ "\n\nHabilidades: "
				+ "\nTrabalho em Equipe"
				+ "\nAtenção aos Detalhes"
				+ "\nProatividade"
				+ "\nComunicação";
		return BSM;
	}
	
}
