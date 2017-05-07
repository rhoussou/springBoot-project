/**
 * 
 */
package inventory.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import inventory.security.model.User;


/**
 * @author roland
 *
 */
public interface UserRepository extends CrudRepository<User, Long>, QueryDslPredicateExecutor<User> {
	
	User findByUsername(String username);
	
	User findById(Long id);
	
}
