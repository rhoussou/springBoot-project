package inventory.models;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@Builder
@NoArgsConstructor
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class Entry {
	
	@Id
	private String id;
	
	@NonNull
    protected Date entryDate;
	
	@NonNull
    protected List<Entries> entries;
	
	


}
