package com.survey.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
//@ComponentScan("com.survey.apps.repository")
public class AppsApplication {

	//CORS must be updated
	// public static final String CORSclient= "https://survey.myasri.com/";
	public static final String CORSclient= "http://localhost:54322/";

	public static void main(String[] args) {
		SpringApplication.run(AppsApplication.class, args);
	}

}
