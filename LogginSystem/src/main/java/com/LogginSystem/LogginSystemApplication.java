package com.LogginSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan 
public class LogginSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogginSystemApplication.class, args);
		System.out.println("Loggin System program started");
	}

}
