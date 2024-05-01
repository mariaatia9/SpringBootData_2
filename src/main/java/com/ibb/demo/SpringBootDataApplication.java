package com.ibb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@EntityScan(basePackages = "com.ibb.model")
@ComponentScan(basePackages = "com.ibb.*")
@EnableJpaRepositories(basePackages = "com.ibb.repository")
public class SpringBootDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataApplication.class, args);
	}

}
