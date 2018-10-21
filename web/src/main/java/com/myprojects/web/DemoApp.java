package com.myprojects.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.myprojects"})
@EntityScan(basePackages = {"com.myprojects"})
@ComponentScan(basePackages = {"com.myprojects"})
public class DemoApp {
    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class);
    }
}
