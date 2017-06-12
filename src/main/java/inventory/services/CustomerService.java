package inventory.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import inventory.models.Customer;

public interface CustomerService {
	
	public Customer getOneCustomer(String id);
	
    public Page<Customer> getAllCustomer(Pageable pageable);
	
	public Customer getCustomerByUsername(String username);
	
	public Customer getCustomerByEmail(String email);
	
	public Page<Customer> getAllCustomerByLastname(String lastname,Pageable pageable);
	
	public void addCustomer(Customer customer);
	
	public void updateCustomer(Customer customer);
	
}
