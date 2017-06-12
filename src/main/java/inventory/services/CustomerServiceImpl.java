package inventory.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	public Page<Customer> getAllCustomer(Pageable pageable) {
		
		return this.customerRepository.findAll(pageable);
		
	}

	@Override
	public Page<Customer> getAllCustomerByLastname(String lastname,Pageable pageable) {
		return this.customerRepository.findByLastname(lastname,pageable);
	}

	@Override
	public void addCustomer(Customer customer ) {
		this.customerRepository.insert(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		this.customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerByUsername(String username) {
		return this.customerRepository.findByUsername(username);
	}

	@Override
	public Customer getCustomerByEmail(String email) {
		return this.customerRepository.findByEmail(email);
	}

}
