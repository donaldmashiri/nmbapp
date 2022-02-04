package com.example.nmbgtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
public class NmbgtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(NmbgtestApplication.class, args);
    }

}
