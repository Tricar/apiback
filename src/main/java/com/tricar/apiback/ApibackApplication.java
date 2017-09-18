package com.tricar.apiback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
//@ComponentScan(basePackages = "com.tricar.controller")
public class ApibackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApibackApplication.class, args);
	}
}
