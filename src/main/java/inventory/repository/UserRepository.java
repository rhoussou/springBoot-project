/**
 * 
 */
package inventory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import inventory.security.model.User;


/**
 * @author roland
 *
 */
public interface UserRepository extends MongoRepository<User, String>, QueryDslPredicateExecutor<User> {
	
	User findByUsername(String username);
	
	User findById(String id);
	
}
