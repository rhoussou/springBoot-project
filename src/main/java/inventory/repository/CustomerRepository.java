/**
 * 
 */
package inventory.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import inventory.models.Customer;


/**
 * @author roland
 *
 */
public interface CustomerRepository extends MongoRepository<Customer, String>, QueryDslPredicateExecutor<Customer> {
	
	Customer findByUsername(String username);
	
	Customer findByEmail(String email);
	
	Customer findById(String id);
	
	Page<Customer> findByLastname(String lastname,Pageable pageable);
	
}
