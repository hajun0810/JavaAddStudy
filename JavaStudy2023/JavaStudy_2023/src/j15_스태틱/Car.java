package j15_스태틱;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder

public class Car {

	private int carNumber;
	private String model;
	private String company;
	
}
