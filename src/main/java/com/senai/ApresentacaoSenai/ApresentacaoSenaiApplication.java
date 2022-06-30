package com.senai.ApresentacaoSenai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApresentacaoSenaiApplication {

	/**
	 * Para acessar as consultas deve ir no http:localhost:8080 e acessar os endpoint
	 * da classe ContatosController.
	 * O uso dp Postman tambem seria bom
	 */

	public static void main(String[] args) {
		SpringApplication.run(ApresentacaoSenaiApplication.class, args);
	}

}
