package com.pruebatecnica.truper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "com.pruebatecnica.*")
@ComponentScan(basePackages = "com.pruebatecnica.*")
public class TruperApplication {

	public static void main(String[] args) {
		SpringApplication.run(TruperApplication.class, args);
	}

}
