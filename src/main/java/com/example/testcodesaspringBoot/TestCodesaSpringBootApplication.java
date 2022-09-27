package com.example.testcodesaspringBoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestCodesaSpringBootApplication {

	private static Logger logger = LoggerFactory.getLogger(TestCodesaSpringBootApplication.class);
	public static void main(String[] args) {
		try {
			SpringApplication.run(TestCodesaSpringBootApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace(); 
			logger.error("{}",e);
		}
	}

}
