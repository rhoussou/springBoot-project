package inventory.models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Taxonomy implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    private Long id;

}
