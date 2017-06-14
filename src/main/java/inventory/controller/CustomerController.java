package inventory.controller;

import inventory.domain.ErrorResponse;
import inventory.exception.CustomerException;
import inventory.models.Customer;
import inventory.services.CustomerService;
import inventory.services.UploadFileService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	//Save the uploaded file to this folder
    private static String UPLOADED_FOLDER = "/home/roland/Documents/Project/java/CYROLGESTOCK/upload";
	
	@Autowired
    private CustomerService customerService;
	
	@Autowired
    private UploadFileService uploadFileService;
	
    @GetMapping
    public Page<Customer> getCustomers(Pageable pageable) {
        return customerService.getAllCustomer(pageable);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Customer customer, @PathVariable("id") String id) throws CustomerException {
    	
    	Customer alreadyExist = customerService.getCustomerByEmail(customer.getEmail());
    	
    	
    	customer.setId(id);
    	System.out.println("cooooooooooooooooooooooooooooooooooooooooooooooooo");
    	customerService.updateCustomer(customer);
    }

    @PostMapping
    public void insert(@RequestBody Customer customer) throws CustomerException {
    	
    	Customer alreadyExist = customerService.getCustomerByEmail(customer.getEmail());
    	if (alreadyExist != null) {
    		    throw new CustomerException("email already used");
        }
    	customerService.addCustomer(customer);
    }
    
    
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable("id") String id){
        return customerService.getOneCustomer(id);
    }

    @GetMapping("/{lastname}")
    public Page<Customer> getByCategory(@PathVariable("lastname") String lastname, Pageable pageable) {
        return customerService.getAllCustomerByLastname(lastname, pageable);
    }
    
    @RequestMapping(value = "/upload/", method = RequestMethod.POST)
    public void UploadFile(MultipartHttpServletRequest request) throws IOException {
    	uploadFileService.SingleFileUpload(request, "id", UPLOADED_FOLDER);
    }
    
    @ExceptionHandler(CustomerException.class)
    public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {

        ErrorResponse error = new ErrorResponse();
        error.setErrorCode(HttpStatus.CONFLICT.value());
        error.setMessage(ex.getMessage());
        return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);

    }
    
}
