package com.change.microchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicrochangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrochangeApplication.class, args);
		System.out.printf("Bienvenue à l'application de change");
	}
}
