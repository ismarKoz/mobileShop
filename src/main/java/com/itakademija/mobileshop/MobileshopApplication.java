package com.itakademija.mobileshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication()
public class MobileshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileshopApplication.class, args);
	}

}
