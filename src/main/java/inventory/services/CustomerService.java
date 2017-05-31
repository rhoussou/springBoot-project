package inventory.services;

import java.util.List;

import inventory.models.Customer;

public interface CustomerService {
	
	public Customer getOneCustomer(String id);
	
    public List<Customer> getAllCustomer();
	
	public Customer getCustomerByUsername(String username);
	
	public List<Customer> getAllCustomerByLastname(String lastname);
	
	public void addCustomer(Customer customer);
	
	public void updateCustomer(Customer customer);
	
}
