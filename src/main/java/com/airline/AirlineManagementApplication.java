package com.airline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.airline.repository")  // Add this
public class AirlineManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(AirlineManagementApplication.class, args);
    }
}
