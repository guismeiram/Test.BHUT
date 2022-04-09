package com.Test.BHUT;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.web.client.RestTemplate;


@SpringBootApplication(scanBasePackages={
"com.Test.BHUT", "com.Test.Application"})
public class Application {

	private static Logger logger = LoggerFactory.getLogger(Application.class);


	public static void main(String[] args) {
		logger.info("Debug!");
		SpringApplication.run(Application.class, args);
		logger.info("Info");

	}
	
	
	
	@Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
	
	
	  
	  
	  
}
