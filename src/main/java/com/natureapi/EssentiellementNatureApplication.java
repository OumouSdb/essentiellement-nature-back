package com.natureapi;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class EssentiellementNatureApplication {

	public static void main(String[] args) {
		SpringApplication.run(EssentiellementNatureApplication.class, args);
	}

    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }
	 
	 public void addCorsMappings(CorsRegistry registry) {
	     registry.addMapping("/**")
	         .allowedOrigins("*")
	         .allowedMethods("GET","POST","PUT","DELETE","PATCH","OPTIONS");
	 }
	 
//		@Bean
//		public WebMvcConfigurer myMvcConfigurer() {
//			return new WebMvcConfigurer() {
//				//AJOUT D'UN FILTRE
//			
//
//				// CROS ORIGIN
//				@Override
//				public void addCorsMappings(CorsRegistry registry) {
//					//String[] allowedUrls = frontBaseUrl.split(";");
//					registry.addMapping("/**")
//					  .allowedOrigins("*")
//					  //.allowedOrigins(allowedUrls) //en prod
//					  .allowedMethods("GET","POST","PUT","DELETE","PATCH","OPTIONS");
//				}
//			
//				
//			};
//		}
}
