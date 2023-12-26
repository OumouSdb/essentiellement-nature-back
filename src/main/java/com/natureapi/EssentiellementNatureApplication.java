package com.natureapi;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;


@SpringBootApplication
public class EssentiellementNatureApplication {

	public static void main(String[] args) {
		SpringApplication.run(EssentiellementNatureApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	 
	 public void addCorsMappings(CorsRegistry registry) {
	     registry.addMapping("/**")
	         .allowedOrigins("*")
	         .allowedMethods("GET","POST","PUT","DELETE","PATCH","OPTIONS");
	 }
}
