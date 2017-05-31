package inventory.models;


import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import inventory.security.domain.BaseUser;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Document

public class Customer extends BaseUser {
	
	private Date birthdate;
	
	private String avatar;
	
	private String profession;
	
	private String phone;
    
    private String website;
    
    private Adress adress;
    
    private Geo localisation;

}
