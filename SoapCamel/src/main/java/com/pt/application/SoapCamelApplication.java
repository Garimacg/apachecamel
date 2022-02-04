package com.pt.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableAutoConfiguration
@ComponentScan("com.pt")
public class SoapCamelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapCamelApplication.class, args);
	}

}
