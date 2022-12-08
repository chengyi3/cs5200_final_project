package com.example.springboot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages={
		"com.example.springboot.repository", "com.example.springboot.service","com.example.springboot.model", "com.example.springboot.controller"})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	
}
