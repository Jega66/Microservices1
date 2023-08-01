package com.jega.ratingsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"com.jega.controller","com.jega.entity","com.jega.repository","com.jega.model"})
@EntityScan(basePackages= {"com.jega.entity"})
@EnableJpaRepositories(basePackages= {"com.jega.repository"})
public class RatingsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingsServiceApplication.class, args);
	}

}
