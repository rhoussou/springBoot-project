package inventory.controller;

import inventory.domain.ErrorResponse;
import inventory.exception.CustomerException;
import inventory.models.Customer;
import inventory.services.CustomerService;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	//Save the uploaded file to this folder
    private static String UPLOADED_FOLDER = "/home/roland/Documents/Project/java/CYROLGESTOCK/upload";
	
	@Autowired
    private CustomerService customerService;
	
    @GetMapping
    public Page<Customer> getCustomers(Pageable pageable){
        return customerService.getAllCustomer(pageable);
    }

    @PutMapping
    public void update(@RequestBody Customer customer){
    	customerService.updateCustomer(customer);
    }

    @PostMapping
    public void insert(@RequestBody Customer customer) throws CustomerException {
    	Customer alreadyExist = customerService.getCustomerByEmail(customer.getEmail());
    	
    	if (alreadyExist != null) {
    		    throw new CustomerException("Invalid employee name requested");
        }
    	customerService.addCustomer(customer);
    }
    
    
    /*
    @PostMapping
    public void insertData(@RequestBody CustomerModel model) throws CustomerException, IOException {
    	Customer alreadyExist = customerService.getCustomerByEmail(model.getCustomer().getEmail());
    	
    	if (alreadyExist != null) {
    		    throw new CustomerException("erreur de doublon");
        }
    	
    	//String uploadfilename = uploadFileService.SingleFileUpload(model.getFile(), UPLOADED_FOLDER);
    	
    	customerService.addCustomer(model.getCustomer());
    		
    }
    */
    
    
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable("id") String id){
        return customerService.getOneCustomer(id);
    }

    @GetMapping("/{lastname}")
    public Page<Customer> getByCategory(@PathVariable("lastname") String lastname, Pageable pageable) {
        return customerService.getAllCustomerByLastname(lastname, pageable);
    }
    
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public void UploadFile(MultipartHttpServletRequest request) throws IOException {

      Iterator<String> itr = request.getFileNames();
      MultipartFile file = request.getFile(itr.next());
      String fileName = file.getOriginalFilename();
      File dir = new File(UPLOADED_FOLDER);
      if (dir.isDirectory()) {
        File serverFile = new File(dir, fileName);
        BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
        stream.write(file.getBytes());
        stream.close();
      }
    }
    
    @ExceptionHandler(CustomerException.class)
    public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {

        ErrorResponse error = new ErrorResponse();
        
        error.setErrorCode(HttpStatus.PRECONDITION_FAILED.value());

        error.setMessage(ex.getMessage());

        return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);

    }
    
  
 
}
