package com.jega.moviecatlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages= {"com.jega.controller","com.jega.model","com.jega.service"})
public class MovieCatlogServiceApplication {

	@Bean
	RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(MovieCatlogServiceApplication.class, args);
	}

}
