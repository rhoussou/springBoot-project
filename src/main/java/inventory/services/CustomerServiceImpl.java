package inventory.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.models.Customer;
import inventory.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
    private CustomerRepository customerRepository;

	@Override
	public Customer getOneCustomer(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Customer> getAllCustomer() {
		return this.customerRepository.findAll();
	}

	@Override
	public List<Customer> getAllCustomerByLastname(String lastname) {
		return this.customerRepository.findByLastname(lastname);
	}

	@Override
	public void addCustomer(Customer customer) {
		this.customerRepository.save(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		this.customerRepository.insert(customer);
	}

	@Override
	public Customer getCustomerByUsername(String username) {
		return this.customerRepository.findByUsername(username);
	}

}
