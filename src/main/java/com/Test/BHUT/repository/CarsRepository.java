package com.Test.BHUT.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Test.BHUT.model.Cars;

public interface CarsRepository extends MongoRepository<Cars, String>{

}
