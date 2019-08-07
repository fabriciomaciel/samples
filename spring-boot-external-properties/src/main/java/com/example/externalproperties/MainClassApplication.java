package com.example.externalproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "file:external.properties", ignoreResourceNotFound = false)
public class MainClassApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainClassApplication.class, args);
	}

}
