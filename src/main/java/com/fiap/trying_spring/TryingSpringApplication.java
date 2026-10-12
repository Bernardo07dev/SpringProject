package com.fiap.trying_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TryingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TryingSpringApplication.class, args);
	}

}
