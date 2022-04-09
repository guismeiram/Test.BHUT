package com.Test.BHUT.controller;




import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.client.RestTemplate;


import com.Test.BHUT.model.Cars;


@RestController
public class CarsController {


	
	

	@GetMapping("cars")
	public ResponseEntity<List<Cars>> getCars() {
		RestTemplate restTemplate = new RestTemplate();
		Cars[] cars = restTemplate.getForObject("http://api-test.bhut.com.br:3000/api/cars", Cars[].class);
		return new ResponseEntity<>(Arrays.asList(cars), HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/cars/create")
	  public Cars createProduct(@RequestBody Cars cars) {
		String url = "http://api-test.bhut.com.br:3000/api/cars";

	    HttpHeaders httpHeaders = new HttpHeaders();
	    httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
	    HttpEntity<Cars> entity = new HttpEntity<Cars>(cars,httpHeaders);
	    RestTemplate restTemplate = new RestTemplate();
        
      return restTemplate.exchange(url, HttpMethod.POST, entity, new ParameterizedTypeReference<Cars>() {}).getBody();
  }
	
   




	
    
}
