package com.Test.BHUT.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.bson.types.ObjectId;


public class Log {
	
	private String _id;
	private String car_id;
	public String data_hora;
	
	public Log() {
		this.car_id = new ObjectId().toString();
		this.data_hora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
	}
	
	//
}
