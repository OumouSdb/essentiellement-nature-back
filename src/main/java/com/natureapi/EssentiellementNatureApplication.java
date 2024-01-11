package com.natureapi;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@EnableAutoConfiguration
@ComponentScan({"com.natureapi"})
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableJpaRepositories(basePackages = "com.natureapi.repository")
@SpringBootApplication(scanBasePackages = {"com.natureapi.controller","com.natureapi.service","com.natureapi.entity", "com.natureapi.repository"})
public class EssentiellementNatureApplication {

	public static void main(String[] args) {
		SpringApplication.run(EssentiellementNatureApplication.class, args);
	}

    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }


    @Bean
     WebMvcConfigurer myMvcConfigurer() {
        return new WebMvcConfigurer() {
            //AJOUT D'UN FILTRE
            

            // CROS ORIGIN
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                //String[] allowedUrls = frontBaseUrl.split(";");
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        //.allowedOrigins(allowedUrls) //en prod
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS");
            }


        };
    }
}
