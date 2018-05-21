package com.samajik.webapp.samajikwebapp;

import com.samajik.webapp.samajikwebapp.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SamajikWebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SamajikWebappApplication.class, args);
    }
}
