package com.Test.BHUT;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
@ComponentScan(basePackages ={
		"com.Test.BHUT", "com.Test.Application"})
@EnableMongoRepositories("com.Test.BHUT")
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
