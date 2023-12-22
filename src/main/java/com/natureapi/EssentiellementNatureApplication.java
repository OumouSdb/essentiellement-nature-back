package com.natureapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import com.natureapi.service.UserService;
import com.natureapi.service.UserServiceImpl;

@SpringBootApplication
public class EssentiellementNatureApplication {

	public static void main(String[] args) {
		SpringApplication.run(EssentiellementNatureApplication.class, args);
	}
	
	 
	 public void addCorsMappings(CorsRegistry registry) {
	     registry.addMapping("/**")
	         .allowedOrigins("*")
	         .allowedMethods("GET","POST","PUT","DELETE","PATCH","OPTIONS");
	 }
}
