package inventory.controller;

import inventory.models.Customer;
import inventory.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.getAllCustomer();
    }

    @PutMapping
    public void update(@RequestBody Customer customer){
    	customerService.updateCustomer(customer);
    }

    @PostMapping
    public void insert(@RequestBody Customer customer){
    	customerService.addCustomer(customer);;
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable("id") String id){
        return customerService.getOneCustomer(id);
    }

    @GetMapping("/{lastname}")
    public List<Customer> getByCategory(@PathVariable("lastname") String lastname) {
        return customerService.getAllCustomerByLastname(lastname);
    }
 
}
