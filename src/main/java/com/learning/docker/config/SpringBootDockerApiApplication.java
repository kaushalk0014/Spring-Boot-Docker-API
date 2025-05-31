package com.learning.docker.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.learning.docker"})
@SpringBootApplication
public class SpringBootDockerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApiApplication.class, args);
	}

}
