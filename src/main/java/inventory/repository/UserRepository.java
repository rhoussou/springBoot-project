/**
 * 
 */
package inventory.repository;

import org.springframework.data.repository.CrudRepository;

import inventory.security.model.User;


/**
 * @author roland
 *
 */
public interface UserRepository extends CrudRepository<User, Long> {
	
	User findByUsername(String username);

}
