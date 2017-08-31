package com.devopsbuddy2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.devopsbuddy2.backend.persistence.repositories")
public class Devopsbuddy2Application {

	public static void main(String[] args) {
		SpringApplication.run(Devopsbuddy2Application.class, args);
	}
}
