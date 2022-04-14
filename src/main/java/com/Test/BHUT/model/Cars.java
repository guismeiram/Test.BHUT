package com.Test.BHUT.model;


import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "cars")
@JsonIgnoreProperties(value = { "target" })
public class Cars
{	
	@JsonProperty("_id")
	private String _id;
	
	@JsonProperty("title")
	private String title;
	@JsonProperty("brand")
	private String brand;
	@JsonProperty("price")
	private String price;
	@JsonProperty("age")
	private int age;
	@JsonProperty("data_hora")
	public String data_hora;
	
	
	
	
	

	
}
