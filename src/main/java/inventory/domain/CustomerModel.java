package inventory.domain;

import org.springframework.web.multipart.MultipartFile;

import inventory.models.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerModel {
	
	private Customer customer;

    private MultipartFile file;


}
