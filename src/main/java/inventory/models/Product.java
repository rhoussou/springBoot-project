package inventory.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import mongoDbConfig.CascadeSave;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Product {
	
	@Id
    private String id;
	
	@DBRef
	@CascadeSave
	@NonNull
	private Category category;
	

}
