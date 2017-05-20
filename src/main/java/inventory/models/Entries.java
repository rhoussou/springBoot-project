package inventory.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import mongoDbConfig.CascadeSave;

@Getter
@Setter
@Builder
@NoArgsConstructor
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class Entries {
	
	 @Id
	 private String id;
	 
	 @NonNull
	 protected Long quantity;
	 
	 @DBRef
	 @CascadeSave
	 @NonNull
	 private Product product;

}
