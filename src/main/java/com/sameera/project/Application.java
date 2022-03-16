package com.sameera.project;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This class holds the main functions from here the application starts running.
 */
@SpringBootApplication
@OpenAPIDefinition
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
