package com.produkte.produktlistebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.produkte.produktlistebackend")
public class ProduktListeBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProduktListeBackendApplication.class, args);
	}

}
