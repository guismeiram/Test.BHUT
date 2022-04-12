package com.Test.BHUT.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

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
//@Entity
//@javax.persistence.Table(name="TB_CARS")
@Getter
@Setter
@Document(collection = "cars")
public class Cars
{	
	private String _id;
	private String car_id;
	private String title;
	private String brand;
	private String price;
	private int age;
	private List<Log> log_car;
}
