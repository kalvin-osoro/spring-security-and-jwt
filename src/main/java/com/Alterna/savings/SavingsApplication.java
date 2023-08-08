package com.Alterna.savings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EntityScan(basePackages = "com.Alterna.savings.models")
public class SavingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SavingsApplication.class, args);
	}

}
