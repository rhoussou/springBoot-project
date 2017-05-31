/**
 * 
 */
package inventory.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import inventory.models.Customer;


/**
 * @author roland
 *
 */
public interface CustomerRepository extends MongoRepository<Customer, String>, QueryDslPredicateExecutor<Customer> {
	
	Customer findByUsername(String username);
	
	Customer findById(String id);
	
	List<Customer> findByLastname(String lastname);
	
}
