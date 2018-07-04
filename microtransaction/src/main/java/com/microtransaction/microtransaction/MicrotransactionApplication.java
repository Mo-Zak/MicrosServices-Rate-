package com.microtransaction.microtransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicrotransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrotransactionApplication.class, args);
		System.out.printf("Bienvenue à l'application des transactions");
	}
}
