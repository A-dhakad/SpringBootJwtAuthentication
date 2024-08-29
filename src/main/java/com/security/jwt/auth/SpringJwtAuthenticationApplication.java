package com.security.jwt.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJwtAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtAuthenticationApplication.class, args);
		System.out.println("welcome to Spring security jwt authentication");
	}

}
