package com.Test.BHUT.model;






import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@Entity
//@javax.persistence.Table(name="TB_CARS")
@Getter
@Setter
public class Cars
{	
	
	private String _id;
	private String title;
	private String brand;
	private String price;
	private int age;

	
	
	
}
