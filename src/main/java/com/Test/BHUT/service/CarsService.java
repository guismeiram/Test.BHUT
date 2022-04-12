package com.Test.BHUT.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Test.BHUT.model.Cars;
import com.Test.BHUT.repository.CarsRepository;

@Service
public class CarsService {
	 	@Autowired
	    private CarsRepository carsRepository;
	 
	    public Cars salvar(Cars cars) {
	        return this.carsRepository.save(cars);
	    }
	    
	   public List<Cars> obterTodos() {
		return this.carsRepository.findAll();
		   
	   }
	  
	    
	  
	    
}
