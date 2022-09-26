package com.example.testcodesaspringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestCodesaSpringBootApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(TestCodesaSpringBootApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}

}
