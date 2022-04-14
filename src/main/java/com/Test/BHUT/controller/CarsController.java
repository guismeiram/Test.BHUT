package com.Test.BHUT.controller;





import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
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
import com.Test.BHUT.service.CarsService;




@RestController
public class CarsController {

	@Autowired
	private CarsService carsService;
	
	private String url = "http://api-test.bhut.com.br:3000/api/cars";
	
	private RestTemplate restTemplate = new RestTemplate();
	
	@GetMapping("cars")
	public ResponseEntity<List<Cars>> getCars() {
		
		Cars[] cars = restTemplate.getForObject(url, Cars[].class);
		return new ResponseEntity<>(Arrays.asList(cars), HttpStatus.OK);
	}
	
	
	//Crie uma tabela log com os campos: id, data_hora e car_id;
	//• Salvar na tabela log as chamadas efetuadas da api;

	@RequestMapping(value = "/cars/create")
	  public ResponseEntity<Cars> createProduct(@RequestBody Cars cars) {

	    HttpHeaders httpHeaders = new HttpHeaders();
	    httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
	    HttpEntity<Cars> entity = new HttpEntity<Cars>(cars,httpHeaders);
        
        cars = restTemplate.exchange(url, HttpMethod.POST, entity, new ParameterizedTypeReference<Cars>() {}).getBody();
        cars.data_hora =  LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        
       return ResponseEntity.ok(carsService.salvar(cars));
  }
	

  
	@GetMapping("/cars/list")
  public ResponseEntity<List<Cars>> listarCars(){
	return ResponseEntity.ok(carsService.obterTodos());
	  
  }
}
