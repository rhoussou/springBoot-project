package inventory.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Adress  {
	
	private String city;
	
	private String zip;

	private String state;
	
	private String  suite;


}
