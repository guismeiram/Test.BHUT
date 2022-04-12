package com.Test.BHUT.model;






import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
//@Entity
//@javax.persistence.Table(name="TB_CARS")
@Getter
@Setter
@Document(collection = "cars")
public class Cars
{	
	
	private String _id;
	private String title;
	private String brand;
	private String price;
	private int age;
	public String Hora;
	public String data;
	
	public Cars(String title, String brand, String price, int age, String hora, String data) {
		this.title = title;
		this.brand = brand;
		this.price = price;
		this.age = age;
		this.Hora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));;
		this.data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));;
	}

	
	
	
}
